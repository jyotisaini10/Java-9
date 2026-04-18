import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class ExceptionHandlingDemo_q1 {

    private static final Logger logger = LogManager.getLogger(ExceptionHandlingDemo_q1.class);

    public static void main(String[] args) {

        testNullFile();
        testArrayIndex();
        testNullString();

        System.out.println("Application completed gracefully.");
    }

    // Test Case 1
    public static void testNullFile() {
        try {
            File file = null;
            file.getName(); // Will throw NullPointerException
        } catch (NullPointerException e) {
            logger.error("NullPointerException occurred", e);
        }
    }

    // Test Case 2
    public static void testArrayIndex() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("ArrayIndexOutOfBoundsException occurred", e);
        }
    }

    // Test Case 3
    public static void testNullString() {
        try {
            String str = null;
            System.out.println(str.length()); // Will throw NullPointerException
        } catch (NullPointerException e) {
            logger.error("NullPointerException occurred", e);
        }
    }
}