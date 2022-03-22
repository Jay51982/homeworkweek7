package homeworkweek7;

import java.util.Scanner;  // import java scanner

public class Program16 {
    public static void main(String[] args){
// main method
        Scanner scr = new Scanner(System.in);  // object creation
        System.out.print("Enter the number :  ");
        int num1 = scr.nextInt();

        if(num1> 0)
        {
            System.out.println(num1 +" is a positive number.");
        }
        else if(num1 < 0)
        {
            System.out.println(num1+" is a negative number.");
        }
        else
        {
            System.out.println(num1+" is Zero.");
        }
    }

}
