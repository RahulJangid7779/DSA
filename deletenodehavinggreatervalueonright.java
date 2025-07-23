class Node {
  int data;
  Node next;

  Node(int data) {
      this.data = data;
  }
}

public class Main {

  // Function to reverse a linked list
  static Node reverse(Node head) {
      Node prev = null;
      Node curr = head;

      while (curr != null) {
          Node next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }

      return prev;
  }

  // Main function to delete nodes with greater value on right
  static Node deleteNodes(Node head) {
      // Step 1: Reverse the list
      head = reverse(head);

      // Step 2: Initialize maxSoFar and a dummy node
      int maxSoFar = Integer.MIN_VALUE;
      Node dummy = new Node(-1); // Temporary dummy node
      Node newList = dummy;

      // Step 3: Traverse reversed list and build new filtered list
      Node curr = head;
      while (curr != null) {
          if (curr.data >= maxSoFar) {
              newList.next = new Node(curr.data);
              newList = newList.next;
              maxSoFar = curr.data;
          }
          curr = curr.next;
      }

      // Step 4: Reverse the filtered list again to restore original order
      return reverse(dummy.next);
  }

  // Utility to print the linked list
  static void printList(Node head) {
      while (head != null) {
          System.out.print(head.data + " ");
          head = head.next;
      }
      System.out.println();
  }

  // Main method to test
  public static void main(String[] args) {
      Node head = new Node(12);
      head.next = new Node(15);
      head.next.next = new Node(10);
      head.next.next.next = new Node(11);
      head.next.next.next.next = new Node(5);
      head.next.next.next.next.next = new Node(6);
      head.next.next.next.next.next.next = new Node(2);
      head.next.next.next.next.next.next.next = new Node(3);

      System.out.print("Original List: ");
      printList(head);

      Node result = deleteNodes(head);

      System.out.print("Modified List: ");
      printList(result);
  }
}
