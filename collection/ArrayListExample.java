package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding 10 string elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Durian");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Gooseberry");
        list.add("Jackfruit");

        // a. Adding an element to the ArrayList
        list.add("Kiwi");

        // b. Iterating through the ArrayList using an Iterator object
        System.out.println("Elements in the ArrayList:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c. Adding an element at a specific index
        list.add(2, "Lemon");

        System.out.println("After adding an element at index 2:");
        for (String str : list) {
            System.out.println(str);
        }

        // d. Removing an element from the ArrayList
        list.remove("Durian");

        // Removing an element at an index
        list.remove(4);

        System.out.println("After removing elements:");
        for (String str : list) {
            System.out.println(str);
        }

        // e. Updating the element at a specific index
        list.set(2, "Lemon");

        System.out.println("After updating the element at index 2:");
        for (String str : list) {
            System.out.println(str);
        }

        // f. Checking the element is present at a particular index
        if (list.contains("Apple")) {
            System.out.println("Element 'Apple' is present at index: " + list.indexOf("Apple"));
        } else {
            System.out.println("Element 'Apple' is not present in the ArrayList");
        }

        // g. Getting an element at a particular index
        System.out.println("Element at index 5: " + list.get(5));

        // h. Finding out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // i. Checking the given element is present in the ArrayList
        if (list.contains("Durian")) {
            System.out.println("Element 'Durian' is present in the ArrayList");
        } else {
            System.out.println("Element 'Durian' is not present in the ArrayList");
        }

        // j. Removing all elements of the ArrayList
        list.clear();
        System.out.println("After removing all elements of the ArrayList, size of the ArrayList: " + list.size());
    }
}
