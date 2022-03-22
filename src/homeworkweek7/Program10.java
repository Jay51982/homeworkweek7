package homeworkweek7;

import java.util.Scanner; //import java scanner

public class Program10 {

    public static void main(String[] args) {
        char ch;
        Scanner scr = new Scanner(System.in);//scanner creation
        System.out.print("Enter  the first number :  ");//print statement
        int num1 = scr.nextInt();//read the number

        System.out.print("Enter the second number :  ");
        int num2 = scr.nextInt();//read the number

        System.out.print("Enter the operator you want(+,-,*,/)  :  ");
        ch = scr.next().charAt(0);
        //if--else condition
        if (ch == '+') {
            System.out.print(" Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.print("substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.print("Multiplicatin of " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Operator is not available");
        }

    }
}
