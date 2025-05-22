// 3c.6 Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
package java_question_3c;

public class IsNumericCheck {
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String test1 = "123456";
        String test2 = "123abc";

        System.out.println(test1 + " is numeric? " + isNumeric(test1));
        System.out.println(test2 + " is numeric? " + isNumeric(test2));
    }
}
