public class Learning15_ConditionalStatementIfElse {

    public static void main(String[] args) {
        /// if-else conditional statement
        int number = 15;

        // ignore: warning
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        /// else if
        int marks = 85;

        // ignore warning
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F");
        }

        /// Nested if statement
        boolean isLoggedIn = true;
        boolean hasSubscription = true;

        if (isLoggedIn) {
            System.out.println("User is logged in.");

            // Single line if statement
            if (hasSubscription) System.out.println("Premium access granted.");
        }

        /// Logical Operators && (AND), || (OR) and ! (NOT) works here too
        // if (... && ...) if(... || ...) and if(!...) condition inverting
        boolean isAdmin = false;
        boolean isModerator = true;

        if (isAdmin || isModerator) System.out.println("Permission granted.");

        /// Shorthand of if-else or ternary operator
        // Syntax:
        // Condition ? valeIfTrue : valueIfFalse
        boolean isActive = true;

        System.out.println(isActive ? "Is active.": "Not active");
    }

}
