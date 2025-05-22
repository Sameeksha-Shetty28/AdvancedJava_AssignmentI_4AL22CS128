
// 3b.4 Write a Java Program for Checking if a string reads the same backward as forward (ignoring caseand punctuation) using user defined function isPalindrome():package java_question_3b;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Remove punctuation and whitespace, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome? " + isPalindrome(test));
    }
}
