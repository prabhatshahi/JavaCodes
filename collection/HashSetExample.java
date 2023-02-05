package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("John");
        set.add("Jane");
        set.add("Bob");
        set.add("Alice");
        set.add("Charlie");
        set.add("Emily");
        set.add("William");
        set.add("Michael");
        set.add("Sarah");
        set.add("David");

        // a. Adding an element to the HashSet
        set.add("Liam");

        // b. Iterating through the HashSet using an Iterator
        Iterator<String> iterator = set.iterator();
        System.out.println("Elements in the HashSet: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c. Removing an element from the HashSet
        set.remove("Jane");
        System.out.println("HashSet after removing 'Jane': " + set);

        // d. Updating an element in the HashSet (not possible since HashSet does not allow duplicates)

        // e. Checking if an element is present in the HashSet
        if (set.contains("Bob")) {
            System.out.println("Element 'Bob' is present in the HashSet");
        } else {
            System.out.println("Element 'Bob' is not present in the HashSet");
        }

        // f. Checking if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        // g. Getting the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // h. Removing all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);

        // i. Copying elements from one HashSet to another
        Set<String> set2 = new HashSet<>(set);
        System.out.println("Copied HashSet: " + set2);
    }
}
