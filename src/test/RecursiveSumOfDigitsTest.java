import static org.junit.Assert.*;
import org.junit.Test;


public class RecursiveSumOfDigitsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(10, RecursiveSumOfDigits.sumOfDigits(1234));
        assertEquals(15, RecursiveSumOfDigits.sumOfDigits(555));
        assertEquals(1, RecursiveSumOfDigits.sumOfDigits(10));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(10, RecursiveSumOfDigits.sumOfDigits(-1234));
        assertEquals(15, RecursiveSumOfDigits.sumOfDigits(-555));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, RecursiveSumOfDigits.sumOfDigits(0));
        assertEquals(9, RecursiveSumOfDigits.sumOfDigits(9));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(45, RecursiveSumOfDigits.sumOfDigits(123456789));
    }
}
