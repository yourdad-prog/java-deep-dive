
import java.util.*;

public class HashMapInternalsDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add entries past the resize threshold (12) to force a resize from 16 -> 32
        for (int i = 1; i <= 15; i++) {
            map.put("key" + i, i);
        }
        System.out.println("Size after 15 puts: " + map.size());
        // The map silently resized internally once we passed 12 entries.

        // Demonstrate update vs insert: same key overwrites, doesn't duplicate
        map.put("key1", 999);
        System.out.println("key1 after re-put: " + map.get("key1")); // 999, not duplicated
        System.out.println("Size still: " + map.size());            // unchanged — it was an update

        // Two distinct keys that are NOT equal both survive (no overwrite)
        map.put("apple", 1);
        map.put("banana", 2);
        System.out.println("apple: " + map.get("apple") + ", banana: " + map.get("banana"));
    }
}