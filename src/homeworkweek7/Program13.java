package homeworkweek7;

import java.util.Scanner;  // import java scanner

public class Program13 {
    // main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  // object creation
        System.out.print("Enter the Week day Number  :   ");
        int day = scr.nextInt();        // varibale declare and user input
        int days;

        //switch statement
        switch (day) {
            case 1:
                System.out.println("1 = Sunday");
                break;
            case 2:
                System.out.println("2 = Monday");
                break;
            case 3:
                System.out.println("3 = Tuesday");
                break;
            case 4:
                System.out.println("4 = Wednesday");
                break;
            case 5:
                System.out.println("5 = Thursday");
                break;
            case 6:
                System.out.println("6 = Friday");
                break;
            case 7:
                System.out.println("7 = Saturday");
                break;
            default:
                System.out.println("Invalid Day Number ");

        }
        System.out.println("********************************");
    }
}
