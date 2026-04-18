import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingIntegration_q2 {

    private static final Logger logger = LogManager.getLogger(LoggingIntegration_q2.class);

    public static void main(String[] args) {

        divideByZero();
        arrayOutOfBounds();
        nullStringAccess();

        System.out.println("Program continued after logging exceptions.");
    }

    public static void divideByZero() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException occurred.", e);
        }
    }

    public static void arrayOutOfBounds() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("ArrayIndexOutOfBoundsException occurred.", e);
        }
    }

    public static void nullStringAccess() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            logger.error("NullPointerException occurred.", e);
        }
    }
}