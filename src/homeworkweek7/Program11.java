package homeworkweek7;

public class Program11 {
    // main method
    public static void main(String[] args) {
        System.out.println("Divided  by 3 : ");
        for (int i = 1; i < 100; i++) {           // for loop
            if (i % 3 == 0)
                System.out.println(i + " , ");
        }
        System.out.println("Divided by 5  :  ");
        for (int i = 1; i < 100; i++) {           // for loop
            if (i % 5 == 0)
                System.out.println(i + " , ");
        }
    }
}
