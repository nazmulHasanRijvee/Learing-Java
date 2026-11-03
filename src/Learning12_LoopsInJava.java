public class Learning12_LoopsInJava {

    public static void main(String[] args) {
        /// for loop
        // Syntax:
        // for (initialize; condition; increment/decrement) {...}
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Calculate the sum of numbers using for loop
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);

        // for loop to iterate over an array
        String[] languages = {"Java", "Dart", "Python"};

        for (String lang : languages) {
            System.out.println(lang);
        }

        /// While loop
        // Syntax:
        // initialize
        // while (condition) {
        //    increment/decrement
        // }

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        /// do-while loop
        // Executes its body at least only once
        // do {
        //   Code to execute
        //   increment/decrement
        //} while (condition);

        int number = 10;

        do {
            System.out.println(number); // 10
        } while (number < 5);



    }

}
