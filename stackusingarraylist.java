import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackList;

    // Constructor
    public Stack() {
        stackList = new ArrayList<>();
    }

    // Push element onto stack
    public void push(int value) {
        stackList.add(value);
        System.out.println(value + " pushed to stack.");
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stackList.remove(stackList.size() - 1);
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackList.get(stackList.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // Print the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int value : stackList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.printStack();

        System.out.println("Top element is: " + myStack.peek());

        myStack.pop();
        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop(); // Underflow
    }
}
