import java.util.Stack;

public class DeleteMiddleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);  // Top is 5

        int size = stack.size();
        deleteMiddle(stack, 0, size);  // ✅ One function

        System.out.println("Stack after deleting middle:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void deleteMiddle(Stack<Integer> stack, int current, int size) {
        if (stack.isEmpty()) return;

        int x = stack.pop();

        // Recursively reach middle
        deleteMiddle(stack, current + 1, size);

        // Skip pushing back the middle element
        if (current != size / 2) {
            stack.push(x);
        }
    }
}
