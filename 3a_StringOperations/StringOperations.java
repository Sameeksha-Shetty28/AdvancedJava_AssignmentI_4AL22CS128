package java_question_3a;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

        // 3. String Comparison
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        // 4. String Searching
        String message = "Welcome to AIET College";
        System.out.println("Message contains 'AIET'? " + message.contains("AIET"));
        System.out.println("Index of 'College': " + message.indexOf("College"));

        // 5. Substring Operations
        String sub = message.substring(11, 15);
        System.out.println("Substring (11–15): " + sub);

        // 6. String Modification
        String modified = message.replace("AIET", "OpenAI");
        System.out.println("Modified message: " + modified);

        // 7. Whitespace Handling
        String spaced = "   Java Programming   ";
        System.out.println("Original with spaces: [" + spaced + "]");
        System.out.println("After trim: [" + spaced.trim() + "]");

        // 8. String Concatenation
        String full = s1 + " " + s2;
        System.out.println("Concatenated: " + full);

        // 9. String Splitting
        String data = "Red,Green,Blue,Yellow";
        String[] parts = data.split(",");
        System.out.println("Splitted Colors:");
        for (String color : parts) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(6, "Java ");
        sb.replace(6, 10, "OpenAI ");
        sb.delete(6, 13);
        System.out.println("StringBuilder Output: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int marks = 95;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "student@aiet.edu";
        System.out.println("Email: " + email);
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Email is valid based on simple checks.");
        } else {
            System.out.println("Invalid email format.");
        }
    }
}
