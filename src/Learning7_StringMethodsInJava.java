public class Learning7_StringMethodsInJava {

    public static void main(String[] args) {
        /// String is a Reference type, it's a class in Java
        // NOTE: Java doesn't support String indexing like name[1]
        // But it has .charAt(), .substring() methods

        /// String pool
        // Java maintains a special memory area called the String Pool
        // unlike String literal which uses the same pool for same contents.
        // Usually String literal is used:
        // String second = "Java";
        // String pool, creates a new object of String():
        // String third = new String("Java");


        /// String concatenation
        // Java provides + operator for this
        String firstName = "Nazmul";
        String lastName = "Hasan";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName); // Nazmul Hasan

        // Concatenating Strings with Other Data Types
        String name = "Nazmul";
        int age = 23;

        String introduction = "My name is " + name + " and I am " + age + " years old.";

        System.out.println(introduction); // My name is Nazmul and I am 23 years old

        /// Common String methods
        /// .length()
        // returns the number of characters in a String. Arrays use .length only
        String userName = "Nazmul";

        System.out.println(userName.length()); // 6

        /// .toUpperCase() and .toLowerCase() methods
        // Converts String to uppercase or lowercase
        String language = "Java Programming";

        System.out.println(language.toUpperCase()); // JAVA PROGRAMMING
        System.out.println(language.toLowerCase()); // java programming

        /// .charAt() method
        // Returns the character at a particular index
        // alternative of language[0]
        // Important: Accessing an invalid index throws StringIndexOutOfBoundsException.
        System.out.println(language.charAt(0)); // J
        System.out.println(language.charAt(3)); // a

        /// .substring() method
        // Extracts a portion of a String. Syntax
        // .substring(beginIndex) or .substring(beginIndex, endIndex)
        System.out.println(language.substring(5)); // Programming
        System.out.println(language.substring(0, 4)); // Java

        /// .contains() method
        // Checks whether a String contains a particular sequence of characters.
        // Returns a boolean.
        String message = "Welcome to Java Programming";

        // System.out.println(message.contains("Python"));
        System.out.println(message);

        /// startsWith() and endsWith() methods
        // Check whether a String starts or ends with a particular value
        // useful when checking file extensions, URL prefixes, and other text patterns
        String filename = "profile.png";

        // System.out.println(filename.startsWith("profile")); // true
        // System.out.println(filename.endsWith(".png")); // true
        System.out.println(filename);

        /// .indexOf() method
        // Returns the index of the first occurrence of a character or substring
        System.out.println(language.indexOf("Programming"));
        System.out.println(language.indexOf("Python"));

        /// .replace() method
        // Replaces occurrences of a character or sequence with another value
        String msg = "I love Python";

        String updatedMessage = msg.replace("Python", "Java");

        System.out.println(updatedMessage); // I love Java

        /// .trim() and .strip() methods
        // These remove whitespace from the beginning and end of a String
        // - trim(): removes characters considered whitespace according to its older, limited definition.
        // - strip(): uses Unicode-aware whitespace handling.
        String customerName = "   Nazmul   ";

        System.out.println(customerName.trim());
        System.out.println(customerName.strip());

        /// .equalsIgnoreCase() method
        // Compares two Strings without considering uppercase/lowercase differences.
        // Useful when case-insensitive comparison is appropriate.
        String first = "JAVA";
        String second = "java";

        // System.out.println(first.equals(second)); // false
        // System.out.println(first.equalsIgnoreCase(second)); // true
        System.out.printf("%s %s",first, second);

        /// == vs .equals()
        // == returns true if both String variables reference the same pooled object.
        // .equals() returns true if their contents are equal regardless of the memory pool


        /// .split() method
        // divides a String into multiple parts based on a regular expression (regex) and
        // returns a String[] array.
        String data = "Java,Python,Dart";

        String[] languages = data.split(",");

        System.out.println(languages[0]);
        System.out.println(languages[1]);
        System.out.println(languages[2]);

        // We can join them back using String concatenation +
        String result = languages[0] + languages[1] + languages[2];
        System.out.println(result);

        // We can also iterate over the result
        for (String lang : languages) {
            System.out.println(lang);
        }


        // Important: split() accepts a regular expression, not just a plain separator.
        // For example, splitting using a dot requires escaping it like `\\.` because
        // a dot  matches almost any character in regex.
        String filename2 = "profile.png";

        String[] parts = filename2.split("\\.");

        System.out.println(parts[0]); // Profile








    }

}
