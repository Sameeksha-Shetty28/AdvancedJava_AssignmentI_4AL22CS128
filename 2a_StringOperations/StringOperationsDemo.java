package java_question_2a;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compared to str2: " + str1.compareTo(str2));

        // String Searching
        String searchText = "Hello World";
        System.out.println("Index of 'World': " + searchText.indexOf("World"));
        System.out.println("Contains 'Hello'? " + searchText.contains("Hello"));

        // Substring Operations
        String sub = searchText.substring(0, 5);
        System.out.println("Substring (0–5): " + sub);

        // String Modification
        String replaced = searchText.replace("World", "Java");
        System.out.println("After replace: " + replaced);

        // Whitespace Handling
        String spaced = "   Java Programming   ";
        System.out.println("Before trim: [" + spaced + "]");
        System.out.println("After trim: [" + spaced.trim() + "]");

        // String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concat);

        // String Splitting
        String csv = "Red,Green,Blue,Yellow";
        String[] colors = csv.split(",");
        System.out.println("Splitting string:");
        for (String color : colors) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.replace(5, 13, "Core ");
        sb.delete(5, 10);
        System.out.println("StringBuilder result: " + sb);

        // String Formatting
        int age = 25;
        String name = "Alice";
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // Validate Email using contains(), startsWith(), endsWith()
        String email = "user@example.com";
        System.out.println("Validating Email: " + email);
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Email format looks valid.");
        } else {
            System.out.println("Invalid email format.");
        }
    }
}
