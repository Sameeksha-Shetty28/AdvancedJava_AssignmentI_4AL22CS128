package java_question_1b;

import java.util.*;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        List<String> subColors = colors.subList(0, 2); // 1st and 2nd elements
        System.out.println("Original Colors: " + colors);
        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}
