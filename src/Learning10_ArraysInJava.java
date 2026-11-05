import java.util.Arrays;
import java.util.List;

public class Learning10_ArraysInJava {

    public static void main(String[] args) {
        /// Arrays are reference type
        // It's a mutable. fixed size/length list with better memory efficiency
        // used for low-level programming APIs. String[] args in main() is an Array!

        /// Declaring and initializing an Array
        // There are two ways to create an array
        // 1. using new keyword and initializing each element individually
        // new int[5] specifies the fixed size or length of the Array
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Arrays.toString() converts the Array to a String
        System.out.println(Arrays.toString(numbers));

        // 2. initialize during declaration using curly brackets {...} RECOMMENDED
        int[] numbers2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numbers2));

        // Extra: Initializing after declaration
        int[] numbers3;
        numbers3 = new int[]{1, 2, 3, 4, 5};
                          // 0  1  2  3  4
        System.out.println(Arrays.toString(numbers3));

        /// Accessing Array elements
        // just like a List using 0 based indexing
        // {1, 2, 3, 4, 5};
        //  0  1  2  3  4
        System.out.println(numbers3[0]); // 1


        /// Updating Array elements
        System.out.println(numbers3[4]); // 5

        numbers3[4] = 50;

        System.out.println(Arrays.toString(numbers3)); // [1, 2, 3, 4, 50]

        /// .lenth property or field
        // returns the fixed size or length of the Array
        // Not .length() like String because .length is a field in Array not a method
        System.out.println(numbers3.length); // 5

        /// Java also assigns default values to array elements automatically
        // When an array is created using new, its elements receive default values
        int[] numbers4 = new int[3];
        String[] names = new String[3];

        System.out.println(numbers4[0]); // 0
        System.out.println(names[0]); // null

        /// for loop with Arrays
        // Iterating over it
        // syntax:
        // for (initialization: Array/List) {...}
        int[] numbers5 = {10, 20, 30, 40, 50};

        for (int number : numbers5) {
            System.out.println(number);
        }

        // finding the largest element in the Array
        int largest = numbers5[0];

        for (int number : numbers5) {
            if (number > largest) largest = number;
        }

        System.out.println(largest); // 50


        /// Arrays.toString() method
        // in java.util.Arrays or Arrays utility class
        // Converts an array to String representation with square brackets []
        System.out.println(Arrays.toString(numbers5));

        /// Arrays.sort() method
        // Sorts an array
        int[] numbers6 = {50, 10, 40, 20, 30};

        Arrays.sort(numbers6);

        System.out.println(Arrays.toString(numbers6)); // [10, 20, 30, 40, 50]

        /// Arrays.equals() method
        // compares to Arrays and returns true if same length and same contents
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};

        System.out.println(Arrays.equals(first, second)); // true

        /// Arrays.fill() method
        // initialize/fills every element of an Array with the same value.
        // Like List.filled() in Dart
        int[] numbers7 = new int[5];

        Arrays.fill(numbers7, 10);

        System.out.println(Arrays.toString(numbers7)); // [10, 10, 10, 10, 10]

        /// Arrays.asList() method
        // Converts an Array to a List, but it can cause unsupported operation issues
        // for some List methods like .clear()
        List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numbers8);

        /// Arrays.copyOf() method
        // Creates a copy of an Array with a specified length
        int[] original = {10, 20, 30};

        int[] copied = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(copied));

        // if copied Arrays specified length is bigger, then Java assigns default value 0
        // for those
        int[] original2 = {10, 20, 30};

        int[] copied2 = Arrays.copyOf(original2, 5);

        System.out.println(Arrays.toString(copied2)); // [10, 20, 30, 0, 0]

        /// Array references behavior
        // This doesn't create a new Array rather refers to the same Array object
        // The same memory reference problem of List in Python, Dart
        // int[] f1 = {10, 20, 30};
        // int[] f2 = f1;
        // In order to creat a separate copy of Array object use Arrays.copyOf()

        /// Multi-dimensional Arrays
        // Declaring and initializing 2D Array
        // A 2D Array is an Array of Arrays
        // using new int[3][3] or this:
        int[][] marks = {
                // 0  1   2
                {85, 90, 88}, // Row 0
                {75, 80, 92}, // Row 1
                {95, 85, 90} // Row 2
        };

        // Accessing elements
        System.out.println(marks[0][0]); // 85
        System.out.println(Arrays.toString(marks[1])); // [75, 80, 92]

        // Updating elements
        marks[0][1] = 81;
        System.out.println(marks[0][1]); // 81
    }

}
