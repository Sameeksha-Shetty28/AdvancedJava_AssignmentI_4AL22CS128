// 3c.7 Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()

package java_question_3c;

public class TruncateString {
    public static String truncate(String str, int length) {
        if (str == null || length <= 0) return "";

        if (str.length() <= length) {
            return str;
        } else {
            return str.substring(0, length) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Artificial Intelligence and Emerging Technologies";
        System.out.println("Original: " + input);
        System.out.println("Truncated: " + truncate(input, 15));
    }
}
