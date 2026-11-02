public class Learning2_VariablesInJava {

    // instance variables
    // has default values unlike local variables in methods
    static int myAge;

    public  static  void main (String [] args) {

        /// Variables in Java, Local vars
        String studentName = "John";
        int studentAge = 23;
        double studentGpa = 3.85;
        boolean isActive = true;

        // Printing Variables
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(studentGpa);
        System.out.println(isActive);

        // By default, 0
        System.out.println(myAge);

        String name;
        /// Variable initialization
        name = "Alex";

        /// Variable declaration and initialization
        int age = 23;

        System.out.println(name);
        System.out.println(age);

        /// final Variables Cannot Be Reassigned
        final int MAX_USERS = 200; // UPPER_SNAKE_CASE for constants
        System.out.println(MAX_USERS);

        /// Printing variables in Java
        String userName = "Nazmul";
        int userAge = 23;

        // Using String concatenation +
        System.out.println("My name is " + userName + "and I'm " + userAge);

        // Using .formatted() or printf() Method
        // Specifier       Type
        // %s              String
        // %d              int
        // %f              Floating-point
        // %b              Boolean
        // %n              newline
        System.out.printf("My name is %s and I'm %d%n", userName, userAge);

    }
}
