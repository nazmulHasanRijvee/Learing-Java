public class Learning8_StringBuilderInJava {

    public static void main(String[] args) {
        /// Strings are immutable in Java
        // Once created its content cannot be changed like if we do language.toUpperCase()
        // it returns a result (JAVA) of uppercase of that string but the original String
        // language (java) remains unchanged. The .toUpperCase() method returns a new String()
        // object. The original "Java" object may become eligible for garbage collection
        // if nothing else references it.

        /// Java Make Strings Immutable for:
        // - Security
        // - String pool optimization
        // - Thread safety (Multiple threads can safely share an immutable String
        // without worrying that another thread will change its contents)

        /// StringBuilder: When String needs to modified
        // if we need to construct or modify a String repeatedly like adding 1,000 names to a
        // single String. Java provides a class called StringBuilder for this situation.
        // Unlike String, StringBuilder is mutable meaning its contents can be modified without
        // creating a new String() object for every operation.
        StringBuilder builder = new StringBuilder("Hello");

        System.out.println(builder);

        builder.append(" ");
        builder.append("Java");

        System.out.println(builder);
        // - String: for ordinary text values such as names, emails, statuses, and messages.
        // - StringBuilder: when we're building or modifying text repeatedly, especially inside loops.
    }

}
