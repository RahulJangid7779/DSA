public class mergesortinll {
  public static class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  public Node getMid(Node head) {
      Node slow = head;
      Node fast = head.next; // Corrected fast pointer initialization

      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow; // Middle node
  }

  public Node merge(Node head1, Node head2) { 
      Node mergedLL = new Node(-1); // Dummy node
      Node temp = mergedLL;

      while (head1 != null && head2 != null) {
          if (head1.data <= head2.data) {
              temp.next = head1;
              head1 = head1.next;
          } else {
              temp.next = head2;
              head2 = head2.next;
          }
          temp = temp.next;
      }

      // Attach remaining elements
      if (head1 != null) temp.next = head1;
      if (head2 != null) temp.next = head2;

      return mergedLL.next; // Skip dummy node
  }

  public Node mergeSort(Node head) {
      if (head == null || head.next == null) { // Correct base case
          return head;
      }

      // Find the middle node
      Node mid = getMid(head);
      Node rightHead = mid.next;
      mid.next = null; // Split into two halves

      // Recursively sort left and right halves
      Node leftSorted = mergeSort(head);
      Node rightSorted = mergeSort(rightHead);

      // Merge the sorted halves
      return merge(leftSorted, rightSorted);
  }

  public void printLL(Node head) {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
    mergesortinll ll = new mergesortinll();

      // Creating linked list: 4 -> 2 -> 1 -> 3
      Node head = new Node(4);
      head.next = new Node(2);
      head.next.next = new Node(1);
      head.next.next.next = new Node(3);

      System.out.println("Original Linked List:");
      ll.printLL(head);

      // Sorting the linked list using merge sort
      head = ll.mergeSort(head);

      System.out.println("Sorted Linked List:");
      ll.printLL(head);
  }
}
 