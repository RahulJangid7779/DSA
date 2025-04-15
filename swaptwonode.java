public class SwapTwoNode {

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

  public static Node swapPairs(Node head) {
      if (head == null || head.next == null) {
          return head;
      }

      Node prev = null;
      Node first = head;
      Node second = head.next;
      head = second; // new head after first swap

      while (first != null && second != null) {
          Node nextPair = second.next;

          // Swapping first and second
          second.next = first;
          first.next = nextPair;

          // Connect previous pair to current swapped pair
          if (prev != null) {
              prev.next = second;
          }

          // Update prev to last node in swapped pair
          prev = first;

          // Move to next pair
          first = nextPair;
          if (first != null) {
              second = first.next;
          } else {
              second = null;
          }
      }

      return head;
  }

  // Print the linked list
  public static void printList(Node head) {
      while (head != null) {
          System.out.print(head.data + " -> ");
          head = head.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);

      System.out.print("Original list: ");
      printList(head);

      head = swapPairs(head);

      System.out.print("Swapped pairs: ");
      printList(head);
  }
}
