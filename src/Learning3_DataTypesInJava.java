import java.util.Arrays;

public class Learning3_DataTypesInJava {

    public static void main(String[] args) {

        /// Primitive types
        // Integer types
        byte age = 22; // 8 bits (-128 to 127)
        short year = 2026; // 16 bits (-32,768 to 32,767)
        int salary = 50000; // 32 bits
        long population = 8000000000L; // 64 bits (rarely used when int isn't enough)

        // Floating-point types or decimal numbers
        float temperature = 36.5f; // 32 bits
        double cgpa = 3.85; // 64 bits (used)

        // Character is written in single quotation
        // 16 bits (2 bytes) and represents a single UTF-16 code unit
        // if 65 is assigned it will print A because of conversion in Unicode
        char grade = 'A';

        // boolean
        boolean isActive = true;

        /// Reference types: Strings, Arrays, Classes, Interfaces, Enum
        String studentName = "Alex";
        String[] names = {"Alex", "John", "David"};

        // Only Reference types can be null
        String doc = null; // Can throw NullPointerException at runtime
        System.out.println(doc);

        doc = ".docx";

        // Printing all values
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Temperature: " + temperature);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);

        System.out.println(Arrays.toString(names));
        System.out.println(year);
        System.out.println(doc);
    }

}
