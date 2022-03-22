package homeworkweek7;

import java.util.Scanner; // java class scanner import

public class Program8 {
// main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); // object creation
        System.out.print("Enter alphabet from A to E :"); // user input
        char ch1 = scr.next().charAt(0); // variable declare

        // if..esle state.selection
        if ((ch1 == 'A') || (ch1 == 'a')) {
            System.out.println("Athens");
        } else if ((ch1 == 'B') || (ch1 == 'b'))
        {
            System.out.println("Barcelona");
        } else if ((ch1 == 'C') || (ch1 == 'c'))
        {
            System.out.println("Chicago");
        } else if ((ch1 == 'D')|| (ch1 =='d')) {
            System.out.println("Detroit");
        }else if ((ch1 == 'E') || (ch1 == 'e')) {

            System.out.println("Edinburgh");

        }else if((ch1=='F')||(ch1=='f')){
            System.out.println("Fuji");
        }

        else {
            System.out.println("Invalid input.");
        }
    }
}
