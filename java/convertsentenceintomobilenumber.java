import java.util.Scanner;

public class convertsentenceintomobilenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine().toUpperCase(); // Convert input to uppercase for consistency
        sc.close(); // Close scanner to prevent resource leaks

        String[] str = {"2", "22", "222", "3", "33", "333", "4", "44", "444",
                        "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777",
                        "8", "88", "888", "9", "99", "999", "9999"};

        String ans = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                ans += "0"; // Space is mapped to 0
            } else {
                int j = input.charAt(i) - 'A'; // Convert letter to index
                ans += str[j];
            }
        }

        System.out.println("Mobile keypad sequence: " + ans);
    }
}
// 'H' - 'A' = 72 - 65 = 7 → str[7] = "44"