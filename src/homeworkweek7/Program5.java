package homeworkweek7;

import java.util.Scanner; // import java util scanner

public class Program5 {
// main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); // object creation

        System.out.print("Enter Employee Name : ");   //get input from user - employee name
        String eName = scr.nextLine();                  // initialise variable

        System.out.print("Enter Employee ID : ");   //get input from user - employee id
        int eID = scr.nextInt();

        System.out.print("Enter Basic Salary : ");  //  get input from user - employee basic salary
        double eSalary = scr.nextInt();

        // calculate gross salary
        double grossSalary = eSalary + (eSalary*.1) + (eSalary*.08) + (eSalary*.09) - (eSalary*.2);
//print statement for Payslip print
        System.out.println("____________________________________________");
        System.out.println("|              Salary Slip                  |");
        System.out.println("____________________________________________");
        System.out.println("|  Employee ID :            "+eID+"              |");
        System.out.println("|  Employee Name :            "+eName+"           |");
        System.out.println("____________________________________________");
        System.out.println("|  Basic Salary :        "+eSalary+"            |");
        System.out.println("|  HRA 10% :              "+(eSalary*.1)+"            |");
        System.out.println("|  TA   8% :              "+(eSalary*.08)+"             |");
        System.out.println("|  DA   9% :              "+(eSalary*.09)+"             |");
        System.out.println("|  PF  20% :              "+(eSalary*.09)+"             |");
        System.out.println("____________________________________________");
        System.out.println("| Gross Salary :        "+grossSalary+"             |");
        System.out.println("____________________________________________");

    }

}
