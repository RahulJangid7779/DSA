public class removenthnodefromback {
  static class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  public static Node head;

  // Add to end
  public static void addLast(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      Node temp = head;
      while (temp.next != null) {
          temp = temp.next;
      }
      temp.next = newNode;
  }

  // Print the list
  public static void printList() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  // Remove Nth node from the end
  public static Node findNthFromEnd(Node head, int n) {
    Node first = head;
    Node second = head;

    // Move first pointer n steps ahead
    for (int i = 0; i < n; i++) {
        if (first == null) return null; // n is greater than the length
        first = first.next;
    }

    // Move both until first reaches the end
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    return second;
}

  public static void main(String[] args) {
      addLast(10);
      addLast(20);
      addLast(30);
      addLast(40);
      addLast(50);

      System.out.println("Original List:");
      printList();

      int n = 2;
      removeNthFromEnd(n);

      System.out.println("After removing " + n + "th node from the end:");
      printList();
  }
}
