// 1c.3 Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
package java_question_1c;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        colors.offerLast("Pink");

        System.out.println("After inserting at end: " + colors);
    }
}
