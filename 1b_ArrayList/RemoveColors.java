//1b.2 Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayListpackage java_question_1b;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Original Colors: " + colors);
        colors.remove(1); // 2nd element (index 1)
        colors.remove("Blue");

        System.out.println("Colors after removal: " + colors);
    }
}
