// 1c.5 Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
package java_question_1c;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Before Swap: " + colors);
        Collections.swap(colors, 0, 2); // Swap 1st and 3rd elements
        System.out.println("After Swap: " + colors);
    }
}
