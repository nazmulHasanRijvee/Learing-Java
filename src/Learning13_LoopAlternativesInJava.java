import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Learning13_LoopAlternativesInJava {

    public static void main(String[] args) {
        /// Loop alternatives and optimized in Java
        // there's .map(), IntStream.range() through the Streams API
        // in Java

        /// .map() Method
        // with Arrays convert the to a stream like Lists .stream()
        // using Arrays.Stream() method
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = Arrays.stream(numbers)
                .map(i -> i * 2)
                .toArray();

        System.out.println(Arrays.toString(result)); // [2, 4, 6, 8, 10]

        /// NOTE: .map() method returns a Stream<Integer> not an Array/List
        // This is why .toArray() and .toList() is required to convert back

        // With ArrayList/List
        List<Integer> numbers2 = List.of(6, 7, 9);

        List<Integer> doubled = numbers2.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println(doubled); // [12, 14, 18]

        /// IntStream.range()
        // Generates a list
        List<Integer> numbers3 = IntStream.range(0, 6).boxed().toList();
        System.out.println(numbers3); // [0, 1, 2, 3, 4, 5]

        /// .reduce()
        // Combine elements into one value
        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);

    }

}
