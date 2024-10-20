public class ReverseString {

    // Recursive function to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the substring and add the first character to the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        
        String reversed = reverse(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
