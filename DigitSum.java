public class DigitSum {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        int original = num; // To display original number

        while (num > 0) {
            int digit = num % 10;   // get last digit
            sum += digit;           // add to sum
            num = num / 10;         // remove last digit
        }

        System.out.println("Digit sum of " + original + " is: " + sum);
    }
}
