//package edu.cscc;
import java.util.Scanner;


public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName;
        int count;
        double productCost, total, average;
        count=0;
        total=0;
        average=0;
        System.out.println("Products that cost $100.00 or more");
        while(true) {
            System.out.print("Enter the Product ordered - type 'stop' to end:");
            productName = input.nextLine();
            if (productName.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Enter the cost of the product ordered:");
            productCost = input.nextDouble();
            input.nextLine();
            if(productCost>=100.00){
                total += productCost;
                count++;
            }
        }
        average=total/count;

        System.out.println("There were " + count + " item(s) that had a cost of $100.00 or more");

        System.out.print("The average price of items with a cost of $100.00 or more is $");
        System.out.printf("%.2f",average);

    }
}
