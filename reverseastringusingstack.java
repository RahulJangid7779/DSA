package Stack;

import java.util.Stack;

public class reverseastringusingstack {

    public static String reveString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        // Push all characters to stack
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        // Pop from stack to reverse the string
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reveString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
}
