import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomExceptionDemo_q7 {

    private static final Logger logger = LogManager.getLogger(CustomExceptionDemo_q7.class);

    public static void main(String[] args) {

        processData("10 20 30");   // Valid
        processData("10 abc 30");  // Invalid
        processData("");           // Empty
    }

    public static void processData(String input) {

        try {
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("No data provided.");
            }

            String[] values = input.split(" ");

            for (String val : values) {
                if (!isNumeric(val)) {
                    throw new InvalidDataException("\"" + val + "\" is not a valid number");
                }
            }

            System.out.println("Data processed successfully.");

        } catch (InvalidDataException e) {
            logger.error("InvalidDataException occurred.", e);

        } catch (IllegalArgumentException e) {
            logger.error("IllegalArgumentException occurred.", e);
        }
    }

    // Utility method
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}