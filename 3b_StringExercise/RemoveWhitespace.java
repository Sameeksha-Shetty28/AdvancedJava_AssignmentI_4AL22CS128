// 3b.5 Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()


package java_question_3b;

public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String withSpaces = " J a v a   P r o g r a m ";
        System.out.println("Before: [" + withSpaces + "]");
        System.out.println("After: [" + removeWhitespace(withSpaces) + "]");
    }
}

