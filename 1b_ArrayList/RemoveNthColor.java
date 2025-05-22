//5. Write a java program for getting different colors through ArrayList interface and delete nth  element from the ArrayList object  by  using remove by index
package java_question_1b;

import java.util.*;

public class RemoveNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        int n = 2; // Example: Remove 3rd element (index 2)
        System.out.println("Original Colors: " + colors);

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("Colors after removing index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
