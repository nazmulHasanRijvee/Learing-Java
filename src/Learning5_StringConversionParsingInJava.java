public class Learning5_StringConversionParsingInJava {

    public static void main(String[] args) {
        /// Parsing: String to int/double
        String quantity = "5";

        int productQuantity = Integer.parseInt(quantity);

        System.out.println("Quantity: " + productQuantity);

        // String to double
        double price = Double.parseDouble(quantity);
        System.out.println("Price: " + price);

        // String to bool -> Boolean.parseBoolean(string)

        /// String conversion: int to String
        int finalPrice = 89;

        String priceText = String.valueOf(finalPrice);

        System.out.println("Price as Text: " + priceText);
    }

}
