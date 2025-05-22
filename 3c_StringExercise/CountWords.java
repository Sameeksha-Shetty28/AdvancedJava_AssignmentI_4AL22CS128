// 3c.10 Write a Java Program for Counting the number of words in a string using user defined function countWords()
package java_question_3c;

public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "  This is a sample sentence for word count  ";
        System.out.println("Input: '" + input + "'");
        System.out.println("Word count: " + countWords(input));
    }
}
