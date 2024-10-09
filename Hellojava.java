public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int remainder;
        int result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // For three-digit numbers
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

