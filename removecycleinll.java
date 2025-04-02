public class removecycleinll {
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

  // Remove Cycle
  public static void removeCycle() {
      Node slow = head;
      Node fast = head;
      boolean cycle = false;

      // Detect cycle
      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;

          if (fast == slow) { // Cycle detected
              cycle = true;
              break;
          }
      }

      if (!cycle) {
          return; // No cycle found, so return
      }

      // Reset slow to head
      slow = head;
      Node prev = null; // Keep track of previous node

      // Move both one step at a time to find the start of the cycle
      while (slow != fast) {
          prev = fast; // Track the node before fast
          slow = slow.next;
          fast = fast.next;
      }

      // Break the cycle
      prev.next = null;
  }

  public static void main(String args[]) {
      removecycleinll ll = new removecycleinll();

      ll.addFirst(13);
      ll.addFirst(12);
      ll.addFirst(18);
      ll.addLast(25);

      // Creating a cycle for testing
      ll.tail.next = ll.head.next; // Making tail point to second node (12)

      System.out.println("Cycle detected before removal: " + ll.isCycle()); // Expected: true

      ll.removeCycle(); // Remove the cycle

      System.out.println("Cycle detected after removal: " + ll.isCycle()); // Expected: false
  }
}
