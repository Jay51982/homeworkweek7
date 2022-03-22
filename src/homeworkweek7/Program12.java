package homeworkweek7;

import java.util.Scanner; // import java scanner

public class Program12 {
// main method
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);//object creation
        System.out.print("Enter the input  :  ");//print statement
        char ch = scr.next().charAt(0);//read the input

        System.out.println("*********************");

        //if...else statement
        if ((ch>='a' && ch <='z') || (ch>='A' && ch <= 'Z')) {
            System.out.println( "This is Alphabet. ");
        }else if (ch >= '0' && ch<='9') {
            System.out.println( " This is a Number. ");
        }
        else{
            System.out.println( " This  is a Special character.");

        }
        System.out.println("*********************");
    }

}
