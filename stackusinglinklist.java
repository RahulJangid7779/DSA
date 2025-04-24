public class Stack {

  // Node class
  private class Node {
      int data;
      Node next;

      Node(int value) {
          data = value;
          next = null;
      }
  }

  private Node top;  // Top of the stack

  // Constructor
  public Stack() {
      top = null;
  }

  // Push element onto stack
  public void push(int value) {
      Node newNode = new Node(value);
      newNode.next = top;
      top = newNode;
      System.out.println(value + " pushed to stack.");
  }

  // Pop element from stack
  public int pop() {
      if (isEmpty()) {
          System.out.println("Stack Underflow! Cannot pop.");
          return -1;
      }
      int poppedValue = top.data;
      top = top.next;
      return poppedValue;
  }

  // Peek top element
  public int peek() {
      if (isEmpty()) {
          System.out.println("Stack is empty.");
          return -1;
      }
      return top.data;
  }

  // Check if stack is empty
  public boolean isEmpty() {
      return top == null;
  }

  // Print the stack
  public void printStack() {
      if (isEmpty()) {
          System.out.println("Stack is empty.");
          return;
      }
      System.out.print("Stack elements: ");
      Node current = top;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }

  // Main method to test
  public static void main(String[] args) {
      Stack myStack = new Stack();

      myStack.push(100);
      myStack.push(200);
      myStack.push(300);
      myStack.printStack();

      System.out.println("Top element is: " + myStack.peek());

      myStack.pop();
      myStack.printStack();

      myStack.pop();
      myStack.pop();
      myStack.pop(); // Stack underflow
  }
}
