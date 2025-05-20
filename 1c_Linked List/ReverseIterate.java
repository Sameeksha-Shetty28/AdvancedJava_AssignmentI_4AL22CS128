package java_question_1c;

import java.util.*;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        System.out.println("LinkedList in reverse order:");
        Iterator<String> descending = colors.descendingIterator();
        while (descending.hasNext()) {
            System.out.println(descending.next());
        }
    }
}
