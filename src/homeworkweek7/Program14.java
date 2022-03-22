package homeworkweek7;


//import com.sun.org.apache.bcel.internal.generic.LRETURN;

public class Program14 {
    String firstName = "";
    String lastName = "";
    int age = 0;

    // constructor was not needed for this method
//    public Person(String firstName, String lastName, int age){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
    // Get firstname method
    public String getFirstName() {
        return firstName;
    }

    // Get lastname method
    public String getLastName() {
        return lastName;
    }

    // get age method
    public int getAge() {
        return age;
    }

    // set firstname
    public void setFirstName(String updatedFirstName) {
        this.firstName = updatedFirstName;
    }

    // set lastname
    public void setLastName(String updatedLastName) {
        this.lastName = updatedLastName;
    }

    // set age
    public void setAge(int updatedAge) {
        if (updatedAge > 100 || updatedAge < 0) {
            System.out.println("Invalid value for age");
            return;
        }
        this.age = updatedAge;
    }

    // is Teen
    public boolean isTeen() {
        return age > 12 && age < 20; // eg. true
    }

    // get Full Name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        if (firstName.isEmpty()) return this.lastName;
        if (lastName.isEmpty()) return this.firstName;

        return this.firstName + " " + this.lastName;
    }
    //

    public static void main(String[] args) {
        Program14 person = new Program14();

        person.setFirstName("");
        person.setLastName("");

        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");

        System.out.println("FullName = " + person.getFullName());

    }
}