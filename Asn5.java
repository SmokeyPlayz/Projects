// Damarcus Crowell
// Asn5.java
// CS Assignment 5: ArrayList practice with a String list and an Integer list

import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // first ArrayList holds Strings
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");

        // second ArrayList holds Integers
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(88);
        scores.add(92);
        scores.add(75);
        scores.add(100);

        // display the original lists (basic for loop for fruits, enhanced for loop for scores)
        System.out.println("Original fruits (" + fruits.size() + " items):");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("  " + fruits.get(i));
        }

        System.out.println();
        System.out.println("Original scores (" + scores.size() + " items):");
        for (int score : scores) {
            System.out.println("  " + score);
        }

        // two more operations, tried on both lists: set() and remove()
        fruits.set(1, "Mango");   // replace Banana with Mango
        fruits.remove(0);         // remove the item at index 0 (Apple)

        scores.set(2, 80);        // replace 75 with 80
        scores.remove(0);         // remove the item at index 0 (88)

        // display the lists again because the data and the number of elements changed
        System.out.println();
        System.out.println("Fruits after set() and remove() (" + fruits.size() + " items):");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("  " + fruits.get(i));
        }

        System.out.println();
        System.out.println("Scores after set() and remove() (" + scores.size() + " items):");
        for (int score : scores) {
            System.out.println("  " + score);
        }
    }
}
