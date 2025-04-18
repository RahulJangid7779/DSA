class Node {
  int data;
  Node next;
  Node(int data) {
      this.data = data;
  }
}

public class MultiplyTwoLL {

  // Convert linked list to number
  static long getNumber(Node head) {
      long num = 0;
      long multiplier = 1;
      while (head != null) {
          num += head.data * multiplier;
          multiplier *= 10;
          head = head.next;
      }
      return num;
  }

  // Convert number to linked list (reverse order)
  static Node convertToList(long num) {
      if (num == 0) return new Node(0);

      Node dummy = new Node(-1);
      Node current = dummy;
      while (num > 0) {
          current.next = new Node((int)(num % 10));
          num /= 10;
          current = current.next;
      }
      return dummy.next;
  }

  // Multiply two lists
  static Node multiply(Node l1, Node l2) {
      long num1 = getNumber(l1);
      long num2 = getNumber(l2);
      long result = num1 * num2;
      return convertToList(result);
  }

  // Print list
  static void printList(Node head) {
      while (head != null) {
          System.out.print(head.data + " -> ");
          head = head.next;
      }
      System.out.println("null");
  }

  // Main
  public static void main(String[] args) {
      Node l1 = new Node(3);
      l1.next = new Node(4); // represents 43 (reverse order)

      Node l2 = new Node(2);
      l2.next = new Node(5); // represents 52 (reverse order)

      Node result = multiply(l1, l2); // should be 43 * 52 = 2236
      printList(result); // Output: 6 -> 3 -> 2 -> 2 -> null (represents 2236)
  }
}
