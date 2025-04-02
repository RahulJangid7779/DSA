public class detectingcycleinll {
  public static class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // Add First
  public static void addFirst(int data) {
      Node newNode = new Node(data);
      size++;
      if (head == null) {
          head = tail = newNode;
          return;
      }
      newNode.next = head;
      head = newNode;
  }

  // Add Last
  public static void addLast(int data) {
      Node lastNode = new Node(data);
      size++;
      if (tail == null) {
          head = tail = lastNode;
          return;
      }
      tail.next = lastNode;
      tail = lastNode;
  }

  // Print Linked List
  public static void printll() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("Null");
  }

  // Cycle Detection (Floyd’s Cycle Detection Algorithm)
  public static boolean isCycle() {
      Node slow = head;
      Node fast = head;

      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;

          if (slow == fast) { // Check before moving forward
              return true;
          }
      }
      return false;
  }

  public static void main(String args[]) {
      detectingcycleinll ll = new detectingcycleinll(); // Correct class name

      ll.addFirst(13);
      ll.addFirst(12);
      ll.addFirst(18);
      ll.addLast(13);
      
      // Creating a cycle for testing
      ll.tail.next = ll.head.next; // Making tail point to second node (12)

      System.out.println("Cycle detected: " + ll.isCycle()); // Expected output: true
  }
}
