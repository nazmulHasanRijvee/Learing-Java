import java.util.function.Consumer;
import java.util.function.Function;

public class Learning20_LambdaAndMethodExpression {

    public static void cancelNewTask () {
        System.out.println("Task is Cancelled");
    }

    public static void main(String[] args) {
        /// lambda method and method expression in Java
        // Important: In Java, a lambda must target a functional interface
        // Java provides some built-in functional interfaces
        // Interface        Purpose                             Method
        // ---------        -------                             ------
        // Runnable         No parameter, no return             .run()
        // Consumer<T>      Takes parameter, no return          .accept()
        // Function<T, R>   Takes parameter, returns value      .apply()
        // Predicate<T>     Takes parameter, returns boolean    .test()
        // Supplier<T>      No Parameter, returns value         .get()

        // Basic Syntaxes:

        /// Single line, () -> expression/code
        // Arrow label -> is not a shorthand for return it just an expression
        // to separate the implementation or code body of the lambda
        Runnable task = () -> System.out.println("Hello Java!");

        task.run();

        /// with code body, () -> {}
        Runnable task2 = () -> {
            System.out.println("Hello");
            System.out.println("Java!");
        };

        task2.run();

        /// with parameter/value, (value) -> expression
        Consumer<String> greet = name -> System.out.println("Hello " + name);

        greet.accept("Nazmul");

        /// with return, (value) -> {return ...}
        Function<Integer, Integer> doubleValue = (value) -> value * 2;

        System.out.println(doubleValue.apply(5)); // 10

        // for code block -> {} use an explicit return
        Function<Integer, Integer> doubleValue2 = (value) -> {
            System.out.println("Value " + value);

            return value * 2;
        };

        doubleValue2.apply(2);

        /// Method expression (::)
        // Calls a classes method without using dot and method call making it cleaner
        // syntax:
        // className::classMethod
        Runnable onCancel = Learning20_LambdaAndMethodExpression::cancelNewTask;

        onCancel.run();
    }

}
