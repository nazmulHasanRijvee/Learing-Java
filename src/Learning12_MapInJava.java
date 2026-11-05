import java.util.HashMap;
import java.util.Map;

public class Learning12_MapInJava {

    public static void main(String[] args) {
        /// Map is a Collection framework or class (List/ArrayList) in Java
        // It's a reference type using wrappers like:
        // int -> Integer, double -> Double etc. called Auto-boxing
        // Integer -> integer etc. called Un-boxing
        // It's mutable and stores data in the form of key-value pairs
        // We specify the Key type and Value type during declaration

        /// Declaration and initialization:
        // Map is an interface and HashMap() is a class that implements that interface
        // There are two ways:
        // Declare first add later
        Map<String, String> map = new HashMap<>();

        map.put("name", "Nazmul"); // putting a key-value pair
        map.put("age", "23");

        System.out.println(map);

        // Declare and initialize with value directly
        // using new HashMap<>(Map.of(...))
        Map<String, String> map2 = new HashMap<>(Map.of(
                        "name", "Nazmul",
                        "age", "23",
                        "institution", "TMU"
        ));

        System.out.println(map2);

        /// Important: Use Map.of() by itself for creating unmodifiable/immutable
        // Map. So it can't be added or removed

        /// Maps can have null as values but keys can't be null

        /// .size() method
        // returns the number of key-value pairs
        System.out.println(map2.size()); // 3

        /// .get() method for accessing a value
        // takes a Key and provides it associated value
        System.out.println(map2.get("name")); // Nazmul

        /// .getOrDefault() method
        // provides a fallback value like if a Key doesn't exist returns the set
        // default value
        // Used for safe accessing when a Key may not be present
        System.out.println(map2.getOrDefault("grade", "A"));

        /// .put() method
        // for adding or updating an entry. If the Key already exists then replaces
        // its value
        // It handles both insertion and updating no separate method needed
        map2.put("name", "Alex");

        System.out.println(map2.get("name")); // Alex

        /// .remove() method
        // removes an entry or key-value pair
        // Using the key only or both with the key and value
        Map<String, Integer> map3 = new HashMap<>(Map.of(
                "ok", 200,
                "unauthorized", 401,
                "not_found", 404,
                "error", 500
        ));

        // It can return the removed value
        int result = map3.remove("not_found");

        System.out.println(map3);
        System.out.println(result); // 404

        /// .containsKey() method
        // checks whether a Key exists or not
        System.out.println(map3.containsKey("not_found")); // false

        /// .containsValue() method
        // checks whether a Value exists or not
        System.out.println(map3.containsValue(500)); // true

        /// .isEmpty() method
        // checks whether a Map is empty or not
        System.out.println(map3.isEmpty()); // false

        /// .clear() method
        // clears the Map and makes it empty
        map3.clear();
        System.out.println(map3); // {}

        /// .replace() method
        // updates an existing Keys value in the Map
        // This updates only if the key already exists.
        // Unlike put(), replace() doesn't insert a missing key
        map2.replace("name", "John");

        System.out.println(map2.get("name")); // John

        /// for loop with Map
        // .keySet() method returns a set containing all the Keys
        for (String key : map2.keySet()) {
            System.out.println(map2.get(key));
        }

        /// .values() method
        // returns a Collection containing all the values
        for (String values : map2.values()) {
            System.out.println(values);
        }

        /// .entrySet() method
        // This is one of the most useful ways to iterate through a Map.
        // A Map contains entries, where each entry represents one key-value pair.
        // The .entrySet() method gives us a Set of those entries.
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /// .forEach() with Map with lambda
        map2.forEach((key, value) -> System.out.println(key + " -> " + value));

        /// Copying a Map
        // by passing it as a parameter in new HashMap<>(...)
        // Use Map.copyOf if we want the copy to be unmodifiable
        Map<String, String> map4 = new HashMap<>(map2);

        System.out.println(map4.size());

        /// How a HashMap works
        // It doesn't maintain a particular, rather uses hashing technique
        // Conceptually, Java uses the key's hash code to help determine
        // where the entry belongs internally (in-memory)
        // Key: 101
        //   |
        // hashCode()
        //   |
        // Hashing calculation
        //   |
        // Internal location
        //   |
        // Store key-value entry
        // Later, when users.get(101); Java uses the key's hash information
        // to locate the appropriate internal area and find the matching entry.
        // This is why HashMap is fast-lookup and very efficient

        /// hashCode() and equals()
        // hashCode () produces an integer hash value for a Key
        // HashMap uses this information to help determine where an entry should be stored.
        // equals() checks whether two objects are considered equal.
        // When HashMap encounters keys with matching hash codes, it uses equality checks
        // to identify the correct key

    }

}
