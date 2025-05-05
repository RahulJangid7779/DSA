public class implementqueueusingll {

  // Node class for Linked List
  static class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  // Queue class using Linked List
  static class Queue {
      Node head = null;
      Node tail = null;

      public boolean isEmpty() {
          return head == null && tail == null;
      }

      public void add(int data) {
          Node newNode = new Node(data);
          if (isEmpty()) {
              head = tail = newNode;
          } else {
              tail.next = newNode;
              tail = newNode;
          }
      }

      public int remove() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          int result = head.data;
          if (head == tail) {
              head = tail = null;
          } else {
              head = head.next;
          }
          return result;
      }

      public int peek() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          return head.data;
      }
  }

  public static void main(String[] args) {
      Queue q = new Queue();
      q.add(1);
      q.add(2);
      q.add(3);

      while (!q.isEmpty()) {
          System.out.print(q.peek() + " ");
          q.remove();
      }
  }
}
