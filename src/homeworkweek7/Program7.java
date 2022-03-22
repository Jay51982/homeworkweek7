package homeworkweek7;

import java.util.Scanner;  // java scanner import

public class Program7 {
// main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  // object creation

        System.out.print("Enter Sales ID : ");  // user input - sales id
        int salesID = scr.nextInt();

        System.out.print("Enter Seller's Name : ");   // user input - seller name
        String sellerName = scr.next();

        System.out.print("Enter Sales Amount : ");    // user input - sales amount
        double salesAmount = scr.nextDouble();

        System.out.print("Enter basic salary :");     // user input - basic sales
        double basicSalary = scr.nextDouble();

        // if..else stat. for calculating and display sales commission
        if(salesAmount>=50000){
            System.out.println("Sales commission is : "+(salesAmount*.35));
        }else if(salesAmount>=30000){
            System.out.println("Sales commission is : "+(salesAmount*.2));
        }else if(salesAmount>=20000) {
            System.out.println("Sales commission is : " + (salesAmount *.1));
        }else if(salesAmount>=10000){
            System.out.println("Sales commission is : " + (salesAmount *.05));
        }else if(salesAmount<10000){
            System.out.println("Sales commission is : " + (salesAmount *.02));
        }
    }
}
