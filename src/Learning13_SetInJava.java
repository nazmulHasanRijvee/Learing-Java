import java.util.HashSet;
import java.util.Set;

public class Learning13_SetInJava {

    public static void main(String[] args) {
        /// Set is a Collection framework or class (List/ArrayList) in Java
        // It's a reference type using wrappers like:
        // int -> Integer, double -> Double etc. called Auto-boxing
        // Integer -> integer etc. called Un-boxing
        // It's mutable, dynamic size/length and can't contain duplicates

        /// Declaration and initialization:
        // Set is an interface and HashSet() is a class that implements that interface
        // There are two ways:
        // Declare first add later
        Set<Integer> set = new HashSet<>();

        set.add(1); // adding value
        set.add(2);
        set.add(3);

        System.out.println(set);

        // Declare and initialize with value directly
        // using new ArrayList(List.of(...))
        Set<Integer> set2 = new HashSet<>(Set.of(4, 5, 6));

        System.out.println(set2);

        /// Important: Use Set.of() by itself for creating unmodifiable/immutable Set
        // So it can't be added, removed, replaced

        /// Set also allows null

        /// .size() method
        // returns the Number of Elements or size/length of the Set
        System.out.println(set.size()); // 3

        /// .add() method
        // inserts an element if its already present then its ignored
        set2.add(6);
        set2.add(7);

        System.out.println(set2); // [4, 5, 6, 7]

        // .addAll() method adds multiple elements

        /// .toArray(), .toString() and .stream.toList() through Streams API
        // for converting to Array, String and List
        System.out.println(set2.toArray()[1]); // 5

        /// .contains() method
        // checks whether an element exists
        System.out.println(set2.contains(6)); // true

        // .containsAll() method checks whether all element exists or not

        /// .remove() method
        // removes an element
        set2.remove(6);

        System.out.println(set2);

        /// .isEmpty() method
        // check whether a Set is empty or not
        System.out.println(set2.isEmpty()); // false

        /// .clear() method
        // removes all elements
        Set<Integer> set3 = new HashSet<>(Set.of(4, 5, 6));

        set3.clear();

        System.out.println(set3);

        /// for loop with Set
        for (int num: set2) {
            System.out.println(num);
        }

        /// .forEach()
        set2.forEach(System.out::println);


        /// Copying a Set
        Set<Integer> copied = new HashSet<>(set2);

        System.out.println(copied);
    }

}
