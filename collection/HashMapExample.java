package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "John Doe");
        map.put(2, "Jane Doe");
        map.put(3, "Bob Smith");
        map.put(4, "Alice Johnson");
        map.put(5, "Charlie Brown");
        map.put(6, "Emily Davis");
        map.put(7, "William Brown");
        map.put(8, "Michael Johnson");
        map.put(9, "Sarah Brown");
        map.put(10, "David Johnson");

        // a. Inserting a Key-value mapping into the map
        map.put(11, "Liam Brown");

        // b. Fetching the value of a Key
        System.out.println("Value for Key 4: " + map.get(4));

        // c. Creating a clone/copy of the HashMap
        HashMap<Integer, String> mapClone = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned HashMap: " + mapClone);

        // d. Checking if a given Key is in the Map
        if (map.containsKey(3)) {
            System.out.println("Key 3 is present in the HashMap");
        } else {
            System.out.println("Key 3 is not present in the HashMap");
        }

        // e. Checking if a given value is in the Map
        if (map.containsValue("Alice Johnson")) {
            System.out.println("Value 'Alice Johnson' is present in the HashMap");
        } else {
            System.out.println("Value 'Alice Johnson' is not present in the HashMap");
        }

        // f. Checking if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }

        // g. Printing the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // h. Printing all the Keys of the HashMap
        System.out.println("Keys in HashMap: " + map.keySet());

        // j. Removing a specific Key-value pair
        map.remove(4);
        System.out.println("HashMap after removing Key 4: " + map);

        // k. Copying all elements of the HashMap to another Map
        Map<Integer, String> mapCopy = new HashMap<>(map);
        System.out.println("Copied Map: " + mapCopy);
    }
}

