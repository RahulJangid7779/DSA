public class add1toanumberrepresentasll {

  static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
      }
  }

  // Function to add 1 to the number represented by the linked list
  public static ListNode addOne(ListNode head) {
      // Reverse the linked list
      head = reverse(head);
      
      ListNode current = head;
      int carry = 1; // Initial carry for adding 1

      // Traverse the list and add the carry
      while (current != null && carry > 0) {
          int sum = current.val + carry;
          current.val = sum % 10; // Update the current node
          carry = sum / 10; // Carry for the next node
          current = current.next;
      }

      // If there's still a carry, we need to add a new node
      if (carry > 0) {
          ListNode newNode = new ListNode(carry);
          current.next = newNode;
      }

      // Reverse the linked list again to restore the original order
      return reverse(head);
  }

  // Helper function to reverse the linked list
  public static ListNode reverse(ListNode head) {
      ListNode prev = null;
      ListNode current = head;
      while (current != null) {
          ListNode next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      return prev;
  }

  // Helper function to print the linked list
  public static void printList(ListNode head) {
      while (head != null) {
          System.out.print(head.val + " -> ");
          head = head.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      // Example: 9 -> 9 -> 9 (represents 999)
      ListNode head = new ListNode(9);
      head.next = new ListNode(9);
      head.next.next = new ListNode(9);

      System.out.println("Original List:");
      printList(head);

      ListNode result = addOne(head);
      System.out.println("List after adding 1:");
      printList(result); // Expected: 1 -> 0 -> 0 -> 0
  }
}
