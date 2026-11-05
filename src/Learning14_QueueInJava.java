import java.util.LinkedList;
import java.util.Queue;

public class Learning14_QueueInJava {

    public static void main(String[] args) {
        /// Queue is a Collection framework or class (List/ArrayList) in Java
        // It's a reference type using wrappers like:
        // int -> Integer, double -> Double etc. called Auto-boxing
        // Integer -> integer etc. called Un-boxing
        // It's mutable and dynamic size/length

        /// Declaration and initialization:
        // Queue is an interface and LinkedList() is a class that implements that interface
        // We can't initialize it during declaration
        // Declare first add later
        Queue<String> queue = new LinkedList<>();
        queue.offer("Nazmul"); // adding value
        queue.offer("John");

        System.out.println("Queue:" + queue);
        System.out.println("Queue Size: " + queue.size());
    }

}
