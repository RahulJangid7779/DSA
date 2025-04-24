import java.util.Stack;

public class ReverseStack {

    // Push element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    // Recursively reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);
        reverseStack(s);
        System.out.println("Reversed Stack: " + s);
    }
}
