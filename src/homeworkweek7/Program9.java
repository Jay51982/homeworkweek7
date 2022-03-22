package homeworkweek7;
import java.util.Scanner;  // java scanner import

public class Program9 {
// main method
    public static void main(String[] args) {
        char ch;     // varible declare
        Scanner scr = new Scanner(System.in);//scanner creation
        System.out.println("Please Enter the alphabet between A to F : ");
        ch = scr.next().charAt(0);//read the input
//switch statement
        switch (ch) {
            case 'A':
                System.out.println("A = Athens");
                break;
            case 'B':
                System.out.println("B = Barcelona");
                break;
            case 'C':
                System.out.println("C = Chicago ");
                break;
            case 'D':
                System.out.println("D = Detroit");
                break;
            case 'E':
                System.out.println("E = Edinburgh");
                break;
            case 'F':
                System.out.println("F = Fuji");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }

    }
}
