package application;

import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Sale> saleList = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                saleList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
                        Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                line = br.readLine();
            }

            Map<String, Double> mapList = saleList.stream().collect(
                    Collectors.groupingBy(Sale::getSeller, Collectors.summingDouble(Sale::getTotal)));

            System.out.println();
            System.out.println("Total de vendas por vendedor: ");
            mapList.forEach((n, v) -> System.out.println(n + " - R$: " + String.format("%.2f", v)));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
