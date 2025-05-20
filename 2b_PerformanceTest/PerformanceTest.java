package java_question_2b;

public class PerformanceTest {
    public static void main(String[] args) {
        // Test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTime1 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }

        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;

        // Test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTime2 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }

        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;

        // Results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\nConclusion: StringBuilder is faster than StringBuffer for single-threaded operations.");
        } else {
            System.out.println("\nConclusion: StringBuffer is slower but thread-safe. Use it in multi-threaded environments.");
        }
    }
}
