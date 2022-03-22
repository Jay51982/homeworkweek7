package homeworkweek7;

import java.util.Scanner;
//To check input not is odd or even
public class Program1 {
//main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  // create object
        System.out.print("Input no. : ");    // print statement to get no from user
        int num1 = scr.nextInt();
//if else statement
    if(num1%2==0){
        System.out.println("Input number is even number");
            }else {
        System.out.println("Input number is odd number");
    }

    }
}
