// 1c.1 Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package java_question_1c;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        System.out.println("All Colors: " + colors);
        System.out.println("Iterating from 2nd position:");

        Iterator<String> iterator = colors.listIterator(1); // Start from index 1 (2nd element)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
