public class intersectionpopintoftwoll {
  public static  Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  // Function to get length of the linked list
  public static int getLength(Node head) {
      int len = 0;
      while (head != null) {
          len++;
          head = head.next;
      }
      return len;
  }

  // Function to find intersection point
  public static Node getIntersection(Node head1, Node head2) {
      int len1 = getLength(head1);
      int len2 = getLength(head2);

      // Calculate difference
      int diff = Math.abs(len1 - len2);

      // Move pointer of longer list ahead by 'diff' nodes
      if (len1 > len2) {
          for (int i = 0; i < diff; i++) {
              head1 = head1.next;
          }
      } else {
          for (int i = 0; i < diff; i++) {
              head2 = head2.next;
          }
      }

      // Now move both one by one
      while (head1 != null && head2 != null) {
          if (head1 == head2) {
              return head1;
          }
          head1 = head1.next;
          head2 = head2.next;
      }

      return null; // No intersection
  }

  public static void main(String[] args) {
      // Common part
      Node common = new Node(8);
      common.next = new Node(10);

      // List 1: 3 -> 7 -> 8 -> 10
      Node head1 = new Node(3);
      head1.next = new Node(7);
      head1.next.next = common;
      // List 2: 99 -> 1 -> 8 -> 10
      Node head2 = new Node(99);
      head2.next = new Node(1);
      head2.next.next = common;

      Node result = getIntersection(head1, head2);
      if (result != null) {
          System.out.println("Intersection at node: " + result.data);
      } else {
          System.out.println("No intersection found.");
      }
  }
}
