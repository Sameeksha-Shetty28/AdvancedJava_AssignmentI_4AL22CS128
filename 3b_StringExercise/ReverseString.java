package java_question_3b;

public class ReverseString {
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "AIET College";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverseString(original));
    }
}
