import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GracefulTermination_q3 {

    private static final Logger logger = LogManager.getLogger(GracefulTermination_q3.class);

    public static void main(String[] args) {

        try {
            runApplication();
        } catch (Exception e) {
            logger.error("Unexpected error occurred. Terminating application.", e);
            System.exit(1);
        }
    }

    public static void runApplication() {

        // Uncomment one test at a time to simulate behavior

        divideByZero();
        // arrayOutOfBounds();
        // nullStringAccess();

        System.out.println("This line will not execute if exception occurs.");
    }

    public static void divideByZero() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException occurred.", e);
            System.exit(1);
        }
    }

    public static void arrayOutOfBounds() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("ArrayIndexOutOfBoundsException occurred.", e);
            System.exit(1);
        }
    }

    public static void nullStringAccess() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            logger.error("NullPointerException occurred.", e);
            System.exit(1);
        }
    }
}