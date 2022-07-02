package application;

import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//C:\workspace\Curso DevSuperior\base-de-dados.csv
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Sale> salesList = new ArrayList<>();

        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                salesList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
                        Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                line = br.readLine();
            }

            Double priceAvg = salesList.stream().map(x -> x.averagePrice()).reduce(0.0, (x, y) -> x + y / salesList.size());

            Comparator<Sale> check = Comparator.comparing(Sale::averagePrice);

            List<Sale> topFiveSales = salesList.stream()
                    .filter(x -> x.averagePrice() > priceAvg && x.getYear() == 2016)
                    .sorted(check.reversed())
                    .limit(5)
                    .toList();

            List<Sale> loganSalesList = salesList.stream()
                    .filter(x -> x.getSeller().equals("Logan"))
                    .toList();

            Double loganTotalSales = loganSalesList.stream()
                    .filter(x -> x.getMonth() == 1 || x.getMonth() == 7)
                    .map(x -> x.getTotal())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println();
            System.out.println("Cinco primeiras vendas de 2016 de maior preço médio:");
            topFiveSales.forEach(System.out::println);
            System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7: %.2f", loganTotalSales );

        } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
