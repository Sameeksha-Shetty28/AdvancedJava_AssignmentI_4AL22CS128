package java_question_1b;
import java.util.*;

public class SearchColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Colors: " + colors);
        if (colors.contains("Red")) {
            System.out.println("'Red' is found in the list.");
        } else {
            System.out.println("'Red' is not found in the list.");
        }
    }
}
