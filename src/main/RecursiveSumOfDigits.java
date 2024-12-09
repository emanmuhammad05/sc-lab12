public class RecursiveSumOfDigits {

    // Sum of Digits
    public static int sumOfDigits(int number) {
        if (number < 0) {
            number = Math.abs(number); // Handle negative numbers
        }
        if (number == 0) {
            return 0; // Base case
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("Sum of digits (1234): " + sumOfDigits(1234)); // Output: 10
        System.out.println("Sum of digits (-9876): " + sumOfDigits(-9876)); // Output: 30
    }
}
