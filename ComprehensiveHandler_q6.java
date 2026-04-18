import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComprehensiveHandler_q6{

    private static final Logger logger = LogManager.getLogger(ComprehensiveHandler_q6.class);

    public static void main(String[] args) {

        try {
            runApplication();
        } catch (Exception e) {
            logger.error("Critical error occurred. Application terminating.", e);
            System.exit(1);
        }
    }

    public static void runApplication() {

        // Run one at a time
        divideByZero();
        // arrayOutOfBounds();
        // nullStringAccess();
    }

    public static void divideByZero() {
        int result = 10 / 0; // handled by main catch
    }

    public static void arrayOutOfBounds() {
        int[] array = new int[5];
        System.out.println(array[10]);
    }

    public static void nullStringAccess() {
        String str = null;
        System.out.println(str.length());
    }
}