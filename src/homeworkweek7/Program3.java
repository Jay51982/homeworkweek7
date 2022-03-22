package homeworkweek7;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter pupil Name : ");
        String name1 = scr.next();
        System.out.print("Enter pupil roll no.:");
        int rollNo = scr.nextInt();

        // math marks input
        System.out.print("Enter Math marks:");
        int math = scr.nextInt();
        if ((math < 0) || (math > 100)) {
            System.out.println("Invalid Input,Marks should between 0 to  100");
            System.out.println("Enter Math marks:");
            //  int math1 = scr.nextInt();
            //int math = math1;
        }

        // science marks input
        System.out.print("Enter Science marks:");
        int science = scr.nextInt();
        if ((science < 0) || (science > 100)) {
            System.out.println("Invalid Input,Marks should between 0 to  100");
            System.out.println("Enter Science marks:");
            //int science = scr.nextInt();
        }

// english marks input
        System.out.print("Enter English marks:");
        int english = scr.nextInt();
        if ((english < 0) || (english > 100)) {
            System.out.println("Invalid Input,Marks should between 0 to  100");
            System.out.println("Enter English marks:");
            //  int english = scr.nextInt();
        }
        int total = math + science + english;
        int percentage = total / 3;

        //pass or fail = pupil
        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        //Grade
        String grade="0"; // initalize grade variable
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }
// print statement to print marksheet
        System.out.println("_____________________________________________");
        System.out.println("|    Name             :    " + name1 +          "|");
        System.out.println("|    Roll No.         :    " + rollNo+          "|");
        System.out.println("|____________________________________________|");
        System.out.println("|    Subjects         :      Marks           |");
        System.out.println("|____________________________________________|");
        System.out.println("|    Math             :    " + math   +          "|");
        System.out.println("|    Science          :    "+science  +          "|");
        System.out.println("|    English          :    "+english  +          "|");
        System.out.println("|____________________________________________|");
        System.out.println("|    Total            :    " + total     +  "|");
        System.out.println("|____________________________________________|");
        System.out.println("|    Percentage       :    "+percentage+    "|");
        System.out.println("|    Result           :    "+result    +    "|");
        System.out.println("|    Grade            :    "+grade     +    "|");
        System.out.println("|____________________________________________|");
    }



}

