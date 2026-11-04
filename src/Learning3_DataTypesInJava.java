import java.util.*;

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

        /// Reference type using wrappers like int -> Integer, double -> Double etc.
        /// Collection frameworks List/ArrayList, Map/HashMap, Set/HashSet, Queue/LinkedList
        // These are all classes or collections framework in Java
        // ArrayList actually uses an Array internally
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // adding value
        numbers.add(2);

        // initializing with value
        List<Integer> numbers2 = new ArrayList<>(List.of(1, 2, 3)); // or List.of() for creating an immutable/unmodifiable

        // Map
        Map<String, String> map = new HashMap<>();
        map.put("name", "Nazmul"); // putting a key-value pair

        // initializing with value using Map.of() method
        Map<String, String> map2 =Map.of(
                "name", "Nazmul",
                "age", "23",
                "Institution", "TMU"
        );

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1); // adding value

        // initializing with value
        Set<Integer> set2 = Set.of(1, 2, 3);

        // Queue, can't be initialized with a value
        Queue<String> queue = new LinkedList<>();
        queue.offer("Nazmul"); // adding value




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

        System.out.println(numbers);
        System.out.println(numbers2);

        System.out.println(map);
        System.out.println(map2);

        System.out.println(set);
        System.out.println(set2);

        System.out.println(queue);
    }

}
