public class Learning6_OperatorsInJava {

    public static void main(String[] args) {

        /// Basic Arithmetic
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30

        // When dividing two integers, Java performs integer division and discards
        // the fractional part. If we want a decimal result, at least one operand
        // must be a floating-point value.
        System.out.println(a / b); // 3 not 3.33
        System.out.println(a % b); // 1

        /// Relational Operators or Comparison
        // Operator  Meaning
        //  ==	     Equal to
        //  !=	     Not equal to
        //  >	     Greater than
        //  <	     Less than
        //  >=	     Greater than or equal to
        //  <=	     Less than or equal to

        /// Logical Operators
        // Operator     Name
        //   &&          AND
        //   ||          OR
        //   !           NOT

        /// Assignment Operators
        // Operator     Equivalent to
        // +=           a = a + 5
        // -=           a = a - 5
        // *=           a = a * 5
        // /=           a = a / 5
        // %=           a = a % 5
        int balance = 100;
        balance += 50;

        System.out.println(balance); // 150

        balance -= 30;
        System.out.println(balance); // 120

        balance *= 2;
        System.out.println(balance); // 240

        balance /= 4;
        System.out.println(balance); // 60

        /// Unary Operators
        // Operator     Meaning
        //    +         Negates a value
        //    ++        Increment by 1
        //    --        Decrement by 1
        int number = 10;

        number++;
        System.out.println(number); // 11

        number--;
        System.out.println(number); // 10

        // Prefix vs postfix
        number = 10;
        int result = number++;

        System.out.println(result); // 10
        System.out.println(number); // 11

        number = 10;
        result = ++number;
        System.out.println(result); // 11
        System.out.println(number); // 11

        /// == and .equals()
        // == compares to primitive types like int
        int c = 10;
        int d = 10;
        // System.out.println(c == d); // true
        System.out.println(c + d);

        // .equals() compares String contents
        String first = "Java";
        String second = "Java";

        //System.out.println(first.equals(second)); // true
        System.out.println(first + second);
    }

}
