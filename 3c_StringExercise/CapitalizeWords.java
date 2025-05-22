// 3c.6 Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
package java_question_3c;

public class CapitalizeWords {
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world from aiET college";
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}
