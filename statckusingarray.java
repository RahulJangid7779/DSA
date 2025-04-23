public class Stack {
  private int maxSize;
  private int top;
  private int[] stackArray;

  // Constructor
  public Stack(int size) {
      maxSize = size;
      stackArray = new int[maxSize];
      top = -1;
  }

  // Push element onto stack
  public void push(int value) {
      if (isFull()) {
          System.out.println("Stack Overflow! Cannot push " + value);
          return;
      }
      stackArray[++top] = value;
      System.out.println(value + " pushed to stack.");
  }

  // Pop element from stack
  public int pop() {
      if (isEmpty()) {
          System.out.println("Stack Underflow! Cannot pop.");
          return -1;
      }
      return stackArray[top--];
  }

  // Peek top element
  public int peek() {
      if (isEmpty()) {
          System.out.println("Stack is empty.");
          return -1;
      }
      return stackArray[top];
  }

  // Check if stack is empty
  public boolean isEmpty() {
      return top == -1;
  }

  // Check if stack is full
  public boolean isFull() {
      return top == maxSize - 1;
  }

  // Print the entire stack
  public void printStack() {
      if (isEmpty()) {
          System.out.println("Stack is empty.");
          return;
      }
      System.out.print("Stack elements: ");
      for (int i = 0; i <= top; i++) {
          System.out.print(stackArray[i] + " ");
      }
      System.out.println();
  }

  // Main method to test
  public static void main(String[] args) {
      Stack myStack = new Stack(5);

      myStack.push(10);
      myStack.push(20);
      myStack.push(30);
      myStack.printStack();

      System.out.println("Top element is: " + myStack.peek());

      myStack.pop();
      myStack.printStack();

      myStack.pop();
      myStack.pop();
      myStack.pop(); // Stack underflow
  }
}
