package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Produt #%d\n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
//            while (ch != 'c' && ch != 'C' && ch != 'u' && ch != 'U' && ch != 'i' && ch == 'I') {
//                System.out.print("Dados invalidos, favor digitar novamente: ");
//                ch = sc.next().charAt(0);
//            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c'){
                listProduct.add(new Product(name, price));

            } else if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                listProduct.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                listProduct.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.print("PRICE TAGS: ");
        for (Product list : listProduct){
            System.out.println(list.priceTag());
        }


        sc.close();

    }
}
