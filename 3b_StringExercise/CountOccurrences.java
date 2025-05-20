package java_question_3b;

public class CountOccurrences {
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainStr = "the three thieves threw three things";
        String subStr = "th";

        System.out.println("Occurrences of '" + subStr + "': " + countOccurrences(mainStr, subStr));
    }
}
