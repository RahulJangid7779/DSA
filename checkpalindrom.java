
package Array;
public class checkpalindrom {
    public static void main(String args[]) {
        String str = "racecar";
        int left = 0;
        int right = str.length() - 1; // Fix: Use str.length() - 1

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) { 
                System.out.println("This is NOT a valid palindrome.");
                return; // Exit early
            }
            left++;
            right--;
        }
        
        System.out.println("This is a valid palindrome."); // Print only if loop completes
    }
}
