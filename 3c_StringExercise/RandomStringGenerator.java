// 3c.9 Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
package java_question_3c;

import java.util.Random;

public class RandomStringGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        if (length <= 0) return "";

        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 10;
        System.out.println("Random String of length " + length + ": " + generateRandomString(length));
    }
}
