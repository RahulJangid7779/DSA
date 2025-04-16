public class rotatealinklistbykplace {

  static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
  }

  public static ListNode rotateRight(ListNode head, int k) {
      if (head == null || head.next == null || k == 0) return head;

      // Step 1: Find the length and last node
      ListNode temp = head;
      int length = 1;
      while (temp.next != null) {
          length++;
          temp = temp.next;
      }

      // Step 2: Make the list circular
      temp.next = head;

      // Step 3: Find new tail (length - k % length steps ahead)
      k = k % length;
      int stepsToNewTail = length - k;
      temp = head;
      while (stepsToNewTail-- > 1) {
          temp = temp.next;
      }

      // Step 4: Set new head and break the circle
      ListNode newHead = temp.next;
      temp.next = null;

      return newHead;
  }

  // Helper to print list
  public static void printList(ListNode head) {
      while (head != null) {
          System.out.print(head.val + " -> ");
          head = head.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);

      System.out.println("Original List:");
      printList(head);

      int k = 2;
      ListNode rotated = rotateRight(head, k);
      System.out.println("Rotated List by " + k + " places:");
      printList(rotated);
  }
}
