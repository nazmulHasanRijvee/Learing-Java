public class Learning4_CastingInJava {

    public static void main(String[] args) {
        /// Widening casting:
        // Java automatically converted the int value into a double
        // no casting syntax needed
        // int (32 bits) to double
        int productPrice = 100;
        double precisePrice = 0;

        System.out.println(precisePrice);

        precisePrice = productPrice;
        System.out.println("Widened Price: " + precisePrice);

        /// Narrowing casting:
        // Converts a larger numeric type into a smaller numeric type.
        // Syntax:
        // targetDataType variableName = (targetDataType) value;
        // double to int
        double discountPrice = 89.99;
        int finalPrice = (int) discountPrice;

        System.out.println("Narrowed Price: " + finalPrice);

        /// Casting Between char (UTF-16 code unit) and Numeric Types
        char letter = 'A';
        System.out.println(letter);

        int number = letter;
        System.out.println(number); // 65

        // number to char
        int number2 = 66;
        char letter2 = (char) number2;

        System.out.println(letter2); // B
    }
}
