import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Learning19_MethodsInJava {
    /// We define functions as Methods in Java because everything is in a Class
    // Method is a block of code that performs a particular function and
    // ensures reusability

    /// Method declaration
    // public or access modifier means use anywhere
    // static means it's a member of the class instead being an instance of the class
    // void is return type of the method which means nothing is returned
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    /// Parameters in Methods
    // argument order matters
    public static void calculateTotal (double price, int quantity) {
        double total = price * quantity;

        System.out.println("Total price is: " + total + "$");
    }

    /// Important: There's no named parameters in Java instead builder pattern is used
    // and there's no default or optional parameters in java instead method overloading is used
    // But we can pass any Data type in the parameter like ArrayList, HashMap, HashSet

    /// Method with a return type (String, int, double, boolean etc.)
    // return statement returns a value when the method has a non-void return type
    // and immediately terminates the current method execution
    public static List<String> getLanguages(List<String> languages) {
        languages.add("Java");
        languages.add("Python");
        languages.add("Dart");

        return languages;
    }

    /// Method overloading
    // means creating multiple methods with the same name but different parameter lists
    // Widely used in Java. Java allows to use the same method name as long as the parameter
    // lists are different. Like:
    // - Number of parameters
    // - Parameter type
    // - Parameter order
    // Java determines which overloaded method to execute using the arguments supplied during
    // the call. This is the alternative of optional parameters in Java or different parameters
    // but same operation

    // Two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Three integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    /// Important: we cannot overload a method using only its return type
    // like:
    // int add(int a, int b) {}
    // double add(int a, int b) {}
    // doesn't work

    /// static methods vs instance methods
    // A static method belongs to the class. Can be called without creating an object/instance
    // of the class
    // An instance method belongs to an object/instance. Requires an object to invoke and can't
    // be accessed before it's initialized

    public static void main(String[] args) {
        /// Calling the method
        sayHello();

        calculateTotal(89.99, 5);

        List<String> languages = new ArrayList<>();

        List<String> result = getLanguages(languages);
        System.out.println(result);

        // Method overloading
        System.out.println(add(2, 6)); // 8
        System.out.println(add(10, 20, 30)); // 60
        System.out.println(add(12.5, 11.2)); // 23.7

        // Pass-by-Value
        int value = 10;
        changeNumber(value);
        System.out.println(value); // 10

        int[] values = {10, 20, 30};
        changeFirstElement(values);
        System.out.println(Arrays.toString(values)); // [100, 20, 30]

        int[]  values2 = {10, 20, 30};
        replaceArray(values2);
        System.out.println(Arrays.toString(values2)); // [10, 20, 30]

    }

    /// How Java passes arguments
    // Java is always Pass-by-Value meaning passes arguments by value (not by data type). When the
    // argument is an object reference, the copied value is the reference itself

    // Consider primitive type int. Here value didn't become 100, when changeNumber(value) is
    // called Java copies the primitive value 10 into the method parameter and only changes the local
    // parameter variable. The original value in main() remains 10 and when the method finishes
    // its local parameter (number) disappears.
    // This is passs-by-value
    public static void changeNumber(int number) {
        number = 100;
    }

    // Now consider Reference types (like Arrays). Here, the original Array changes because
    // object and the reference to the object are different things. Java copies the reference
    // value to the method parameter so both variables refer to the same Array object that's why
    // the original Array is changed (shared memory List problem)
    public static void changeFirstElement(int[] numbers) {
        numbers[0] = 100;
    }

    // But if we reassign the parameter then we're creating new Array object
    // So, the references now point to different Arrays and the original Array
    // is unchanged
    public static void replaceArray(int[] numbers) {
        numbers = new int[]{100, 200, 300};
        System.out.println(Arrays.toString(numbers)); // [100, 200, 300]
    }

    /// The Actual Rule
    // Situation                     What happens
    // Passing an integer            A copy of the integer value is passed
    // Passing an Array              A copy of the Array object reference is passed
    // Modifying an Array element    The shared Array object changes
    // Reassigning the method        Only the local reference changes
    // parameter
}
