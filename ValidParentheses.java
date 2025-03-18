import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets
            } else {
                if (stack.isEmpty()) return false; // Closing bracket with no matching open

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, it's valid
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // 
        System.out.println(isValid("(]"));     // ❌ false
        System.out.println(isValid("{[]}"));   // ✅ true
        System.out.println(isValid("([)]"));   // ❌ false
    }
}
