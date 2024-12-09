public class RecursiveBinarySearch {
    
    // Recursive Binary Search for Integer Arrays
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle null or empty array
        }
        if (low > high) {
            return -1; // Base case: range is empty
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high);
        }
    }
    
    // Recursive Binary Search for String Arrays
    public static int binarySearchRecursive(String[] arr, String target, int low, int high) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle null or empty array
        }
        if (low > high) {
            return -1; // Base case: range is empty
        }
        int mid = low + (high - low) / 2;
        int comparison = target.compareTo(arr[mid]);
        if (comparison == 0) {
            return mid;
        } else if (comparison < 0) {
            return binarySearchRecursive(arr, target, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high);
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        String[] words = {"apple", "banana", "cherry", "date", "fig"};
        
        System.out.println("Index of 7: " + binarySearchRecursive(numbers, 7, 0, numbers.length - 1)); // Output: 3
        System.out.println("Index of 'cherry': " + binarySearchRecursive(words, "cherry", 0, words.length - 1)); // Output: 2
    }
}
