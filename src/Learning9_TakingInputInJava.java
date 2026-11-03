import java.util.Scanner;

public class Learning9_TakingInputInJava {

    public static void main(String[] args) {
        /// Java provides a built-in class called Scanner for taking input
        // Scanner allows us to read input from different sources:
        // - Keyboard input.
        // - Files.
        // - Strings.
        // - Other input streams.

        /// Java provides three commonly used standard input/output streams:
        // Stream	    Purpose
        // System.in	Receives standard input
        // System.out	Displays standard output
        // System.err	Displays error output

        /// Reading String Input
        // Scanner provides two methods for reading text:

        // .next() method: reads the next token. By default, Scanner treats whitespace
        // (spaces, tabs, and line breaks) as separators.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");

        String name = scanner.next();

        System.out.println("Hello, " + name);

        // .nextLine() method: reads the remaining text on the current line until the user presses Enter.

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter your full name: ");

        String fullName = scanner2.nextLine();

        System.out.println("Hello, " + fullName);

        /// Reading Different Data types
        // Method           Data type       Example
        // nextByte()       byte            scanner.nextByte()
        // nextShort()      short           scanner.nextShort()
        // nextInt()        int             scanner.nextInt()
        // nextLong()       long            scanner.nextLong()
        // nextDouble()     double          scanner.nextDouble()
        // nextBoolean()    boolean         scanner.nextBoolean()
        // next()           String token    scanner.next()
        // nexLine()        String line     scanner.nextLine()


        /// IMPORTANT: if there's a nextInt() before nextLine() it will get skipped
        // Because \n represents the line separator generated when the user presses Enter.
        // the fix is adding another additional nextLine() before it
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner3.nextInt();

        // Consume the remaining line
        scanner3.nextLine();

        System.out.print("Enter your full name: ");
        String userName = scanner3.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Name: " + userName);

        /// Basic input validation
        // if we input the wrong data type the Scanner throws InputMismatchException
        // hasNextInt() method checks whether the next input token can be interpreted as an integer.
        // It returns a boolean, true if the next token is a valid integer otherwise false
        Scanner scanner4 = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (scanner4.hasNextInt()) {
            int myAge = scanner4.nextInt();

            System.out.println("Your age is: " + myAge);
        } else {
            System.out.println("Please enter a valid integer.");
        }

        /// Other validation methods
        // Method               Checks whether the next token can be read as
        // hasNextInt()         Integer
        // hasNextDouble()      Double
        // hasNextLong()        Long
        // hasNextFloat()       Float
        // hasNextBoolean()     Boolean
        // hasNext()            Another token exists

        /// A different approach, Read everything as String
        // Then parse it:
        Scanner scanner5 = new Scanner(System.in);

        System.out.print("Enter customer age: ");

        int customerAge = Integer.parseInt(scanner5.nextLine());

        System.out.println("Customer Age: " + customerAge);

    }

}
