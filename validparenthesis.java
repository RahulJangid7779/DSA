import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched pair
                }
            }
        }

        // At the end, stack should be empty for valid parentheses
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println("Is the string valid? " + isValid(str));
    }
}
