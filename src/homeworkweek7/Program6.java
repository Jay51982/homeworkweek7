package homeworkweek7;

import java.util.Scanner; // java scanner class import

public class Program6 {
// main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  //object creation
        System.out.print("Enter no :");   // get user input
        int num1 = scr.nextInt();

        // if..else statement
        if(num1%2==0){
            System.out.println(num1+" is a Even number.");  // pirnt state.
        }else {
            System.out.println(num1+" is old number");  // print state.
        }
    }
}
