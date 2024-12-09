import static org.junit.Assert.*;
import org.junit.Test;


public class RecursiveBinarySearchTest {

    @Test
    void testIntegerArray() {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        assertEquals(3, RecursiveBinarySearch.binarySearchRecursive(numbers, 7, 0, numbers.length - 1));
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive(numbers, 2, 0, numbers.length - 1));
        assertEquals(0, RecursiveBinarySearch.binarySearchRecursive(numbers, 1, 0, numbers.length - 1));
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive(numbers, 12, 0, numbers.length - 1));
    }

    @Test
    void testStringArray() {
        String[] words = {"apple", "banana", "cherry", "date", "fig"};
        assertEquals(2, RecursiveBinarySearch.binarySearchRecursive(words, "cherry", 0, words.length - 1));
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive(words, "grape", 0, words.length - 1));
        assertEquals(0, RecursiveBinarySearch.binarySearchRecursive(words, "apple", 0, words.length - 1));
    }

    @Test
    void testEdgeCases() {
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive(new int[]{}, 7, 0, -1));
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive((int[]) null, 7, 0, -1));
        assertEquals(-1, RecursiveBinarySearch.binarySearchRecursive((String[]) null, "apple", 0, -1));
    }
}
