import org.junit.Test;
import static org.junit.Assert.*;

public class Ex1Test {

    @Test
    public void testCalculateGaussSum() {
        long start = 81297;
        long step = 198;
        int count = 100;
        long expectedSum = 9109800; // This is the correct sum for the given progression

        long result = Ex1.calculateGaussSum(start, step, count);
        assertEquals("The sum should be correct for the given progression", expectedSum, result);
    }

    @Test
    public void testCalculateGaussSumWithSmallNumbers() {
        long start = 1;
        long step = 1;
        int count = 100;
        long expectedSum = 5050; // Sum of 1 to 100

        long result = Ex1.calculateGaussSum(start, step, count);
        assertEquals("The sum should be correct for 1 to 100", expectedSum, result);
    }

    @Test
    public void testCalculateGaussSumWithZeroCount() {
        long start = 81297;
        long step = 198;
        int count = 0;
        long expectedSum = 0;

        long result = Ex1.calculateGaussSum(start, step, count);
        assertEquals("The sum should be zero when count is zero", expectedSum, result);
    }
}