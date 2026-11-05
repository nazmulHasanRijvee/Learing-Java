import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

/// Creating a custom exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }

}

public class Learning21_ExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /// Exception is an object representing an abnormal condition that occurs during program
        // execution and disrupts the normal flow of code execution
        // Java organizes errors and exceptions using an inheritance hierarchy.
        //
        // Throwable is the superclass of all objects that can be thrown and caught in Java.
        // It has two branches:
        // Error: represents serious problems that applications generally aren't expected to
        // recover from through ordinary exception handling.
        // - OutOfMemoryError
        // - StackOverflowError
        //
        // Exception: represents conditions that applications may be able to handle.
        // - Invalid user input.
        // - File not found.
        // - Database access problems.
        // - Invalid number formatting.

        /// try-catch block
        Scanner scanner = new Scanner(System.in);

        try {
            //Code that might throw an exception
            System.out.print("Enter your age: ");

            int age = scanner.nextInt();

            System.out.println("Your age is: " + age);
        } catch (InputMismatchException exception) {
            // Handle the exception
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program finished.");


        /// Multiple catch blocks
        try {
            int number = Integer.parseInt("Twenty");

            int result = 100 / number;

            System.out.println(result);
        } catch (NumberFormatException e) {

            System.out.println("Invalid number format.");

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        // Handling different exceptions together in multi-catch
        try {
            int number = Integer.parseInt("Twenty");

            int result = 100 / number;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid calculation input.");
        }

        /// finally {} block
        // it executes after the try-catch processing, whether an exception
        // occurred or not, under normal JVM execution
        try {
            int result = 10 / 2;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Arithmetic error.");

        } finally {

            System.out.println("Finally block executed.");

        }

        System.out.println("Program finished.");

        /// throw
        try {
            validateAge(-5);
        } catch (IllegalArgumentException exception) {
            // .getMessage() retrieves the explanatory String
            System.out.println(exception.getMessage());
        }

        /// throws
        try {
            String content = readFile();

            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();

            System.out.println("Unable to read file.");
        }

        /// Custom Exception
        try {
            withdraw(1000, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        /// Common Java Exceptions
        // Exception                        When it occurs
        // ArithmeticException              Invalid integer arithmetic
        // NullPointerException             An operation is attempted on null value
        // ArrayIndexOutOfBoundsException   Invalid array index
        // StringIndexOuOfBoundsException   Invalid String index
        // NumberFormatException            Invalid numeric String conversion
        // InputMismatchException           Scanner receives an incompatible token
        // IllegalArgumentException         An inappropriate method argument is supplied
    }

    /// throw keyword
    // In order to throw an exception ourselves Java provides the throw keyword
    // throw tells Java to throw an exception.
    // new ExceptionType(...) creates the exception object.
    // The String supplies an explanatory message.
    public static void validateAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");

        System.out.println("Age is valid.");
    }

    /// throws keyword
    // it declares that a method may pass certain exceptions to its caller
    // instead of handling exception inside the method, we can declare it using throws
    // But throws doesn't handle the exception it just declares possible exceptions that
    // can occur when executing that method
    public static String readFile() throws IOException {
        return Files.readString(Path.of("notes.txt"));
    }

    /// throwing the custom exception
    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient account balance."
            );
        }

        System.out.println("Withdrawal successful.");
    }

}
