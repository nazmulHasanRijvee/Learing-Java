import java.util.ArrayList;
import java.util.List;

public class Learning15_ListInJava {

    public static void main(String[] args) {
        /// List is a Collection framework or class (List/ArrayList) in Java
        // It's a reference type using wrappers like:
        // int -> Integer, double -> Double etc. called Auto-boxing
        // Integer -> integer etc. called Un-boxing
        // It's mutable and dynamic size/length unlike Array which is fixed
        // ArrayList actually uses List Array internally

        /// Declaration and initialization:
        // List is an interface and ArrayList() is a class that implements that interface
        // There are two ways:
        // Declare first add later
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1); // adding value
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);

        // Declare and initialize with value directly
        // using new ArrayList(List.of(...))
        List<String> strings = new ArrayList<>(List.of("Java", "Dart", "Python"));

        System.out.println(strings);

        /// NOTE: There's also  Arrays.asList() but it can cause unsupported operation issues
        // for some List methods like .clear()

        /// Important: Use List.of() by itself for creating unmodifiable/immutable list instead of Arrays.asList()
        // So it can't be added, removed, replaced

        /// .size() method
        // returns the number of elements or length/size of the List
        // Unlike Arrays .length field List uses a method size()
        System.out.println(numbers.size()); // 4

        /// .get() method for accessing List elements
        // Unlike Array, we can't access List elements using indexing
        List<Integer> numbers2 = new ArrayList<>(List.of(4, 5, 6));

        System.out.println(numbers2.get(2)); // 6

        // Unless convert it to an Array first using .toArray()
        // then access elements using 0 based indexing
        System.out.println(numbers2.toArray()[2]); // 6

        /// .getFirst() method
        // returns the first element of the List
        System.out.println(numbers2.getFirst()); // 4

        /// .getLast() method
        // returns the last element of the List
        System.out.println(numbers2.getLast()); // 6

        /// .set() method for updating List elements
        // It replaces an existing element at particular index
        // unlike .add() it doesn't add just replaces existing ones
        numbers2.set(2, 10);

        System.out.println(numbers2.get(2)); // 10

        /// .toArray() method
        // Converts a List to an Array
        System.out.println(numbers.toArray().length); // 4


        /// .add() method
        // adds an element to the end of the list
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Dart");

        System.out.println(languages);

        /// .remove() method
        // removes an element from a List
        // remove by index:
        languages.remove(1);

        System.out.println(languages);

        // remove by value:
        languages.remove("Dart");

        System.out.println(languages);

        // The remove() overload issue
        // Java has two method .remove(int index) and .remove(Object value)
        // Make sure to use the right one
        // There's also .removeAll() method

        /// .contains() method
        // Checks whether an element exists in the List
        // There's .containsAll() too
        final List<String> languages2 = new ArrayList<>(List.of("Java", "Dart", "Python"));

        System.out.println(languages2.contains("Java"));

        /// .indexOf() method
        // returns the index of the first matching element
        // If it's not found returns -1
        System.out.println(languages2.indexOf("Python")); // 2

        /// isEmpty() method
        // checks whether the List contains any elements
        System.out.println(languages2.isEmpty());

        /// clear() method
        // Removes all elements
        // Works only on Lists declared it with new ArrayList()
        List<Integer> numbers3 = new ArrayList<>(List.of(1, 2));

        numbers3.clear();
        System.out.println(numbers3); // []

        /// for loop with List
        // iterating over it
        List<Integer> numbers4 = new ArrayList<>(List.of(10, 20, 30));

        for(int num:  numbers4) {
           System.out.println(num);
        }

        /// .forEach() iterating over List
        languages2.forEach(System.out::println);

        /// List references behavior
        // This doesn't create a new Array rather refers to the same Array object
        // The same memory reference problem of List in Python, Dart
        // List<Integer> f1 = new ArrayList<>();
        // List<Integer> f2 = f1;
        // In order to creat a separate copy of ArrayList object pass the original
        // List as parameter in new ArrayList<>(...) when initializing
        List<Integer> original = new ArrayList<>(List.of(1, 2, 3));

        List<Integer> copied = new ArrayList<>(original);
        copied.add(4);

        System.out.println(original);
        System.out.println(copied);


    }

}
