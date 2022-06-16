package application;

import entitites.Company;
import entitites.Individual;
import entitites.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Indivudual or company (i/c)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                taxPayerList.add(new Company(name, anualIncome, numberEmployees));
            }
            sc.nextLine();
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer list : taxPayerList){
            System.out.println(list.showOnScreen());
//            System.out.println(list.getName() + ": $ " + String.format("%.2f", list.tax()));
            sum += list.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
