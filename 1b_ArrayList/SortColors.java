//1b.3 Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
package java_question_1b;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Green", "Blue"));

        System.out.println("Before Sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);
    }
}
