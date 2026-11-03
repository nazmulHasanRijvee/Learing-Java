public class Learning11_ConditionalStatementSwitch {

    public static void main(String[] args) {
        /// switch statement
        // case is the condition to match and default is the fallback if no condition is matched
        // break stops or returns from the current switch execution. Otherwise in Java, it can
        // continue executing the next cases, even though their case values didn't match.
        // This behavior is called fall-through.
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }

        /// Intentionally using Fall-Through when needed
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }

        /// Multiple case labels or conditions (OR) in Modern Java
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");

            case 6, 7 -> System.out.println("Weekend");

            default -> System.out.println("Invalid day");
        }

        /// Modern Switch Syntax with Arrow labels -> with Returning values
        // Arrow label -> is not a shorthand for return it just an expression
        // to separate the implementation for parameters (for lambda functions too)
        String dayName = switch (day) {
            case 1 -> "Monday";

            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            default -> "Invalid day";
        };

        System.out.println(dayName);

        /// yield in switch expressions
        // There's no return keyword for switch statements in Java unless
        // its in a method
        //
        // if a switch statement needs to perform extra logical operations
        // before producing or returning a value, for that Java provides
        // the yield keyword
        // return --> Returns from the current method
        // yield --> Provides a value from a switch expression
        int number = 2;

        String result = switch (number) {
            case 1 -> {
                System.out.println("You selected one.");
                yield "One";
            }

            case 2 -> {
                System.out.println("You selected two.");
                yield "Two";
            }

            default -> {
                System.out.println("Unknown selection.");
                yield "Unknown";
            }
        };

        System.out.println("Result: " + result);
    }

}
