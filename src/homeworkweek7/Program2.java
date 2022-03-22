package homeworkweek7;
// import scanner class
import java.util.Scanner;

public class Program2 {
// main method
    public static void main(String []args){
        Scanner scr = new Scanner(System.in); // object creation
        System.out.print("Enter the year : "); // print statement
        int year = scr.nextInt(); // read input
        System.out.println("***************************"); //print statement
// if else statment
        if(year%400==0){
            System.out.println(year+" year is leap year."); // print stat.
        }else if((year%4==0) && (year%100!=0)){
            System.out.println(year+" year is leap year.");  // print stat.
        }else {
            System.out.println(year+" year is not leap year."); // print stat.
        }
        System.out.println("***************************"); // print stat.
    }
}
