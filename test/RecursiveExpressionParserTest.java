import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursiveExpressionParserTest {

    @Test
    void testSimpleExpressions() {
        assertEquals(8, RecursiveExpressionParser.evaluateExpression("3 + 5"));
        assertEquals(-2, RecursiveExpressionParser.evaluateExpression("3 - 5"));
        assertEquals(15, RecursiveExpressionParser.evaluateExpression("3 * 5"));
        assertEquals(2, RecursiveExpressionParser.evaluateExpression("10 / 5"));
    }

    @Test
    void testComplexExpressions() {
        assertEquals(12, RecursiveExpressionParser.evaluateExpression("(3 + 5) * 2 - 10 / 2"));
        assertEquals(14, RecursiveExpressionParser.evaluateExpression("3 + 5 * 2 + (6 / 3)"));
        assertEquals(19.5, RecursiveExpressionParser.evaluateExpression("3.5 * 2 + 10.5"));
    }

    @Test
    void testInvalidExpressions() {
        assertThrows(IllegalArgumentException.class, () -> RecursiveExpressionParser.evaluateExpression(""));
        assertThrows(IllegalArgumentException.class, () -> RecursiveExpressionParser.evaluateExpression(null));
        assertThrows(ArithmeticException.class, () -> RecursiveExpressionParser.evaluateExpression("10 / 0"));
    }
}
