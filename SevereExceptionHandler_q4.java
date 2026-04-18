import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SevereExceptionHandler_q4{

    private static final Logger logger = LogManager.getLogger(SevereExceptionHandler_q4.class);

    public static void main(String[] args) {

        // Run one test at a time
        divideByZero();
        // arrayOutOfBounds();
        // nullStringAccess();
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