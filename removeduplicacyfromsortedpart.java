public class removeduplicacyfromsortedpart {
  static class Node {
      int data;
      Node next;
      Node(int data) {
          this.data = data;
      }
  }

  static Node head;

  // Function to add elements at the end
  public static void addLast(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      Node temp = head;
      while (temp.next != null)
          temp = temp.next;
      temp.next = newNode;
  }

  // Function to remove duplicates from sorted list
  public static void removeDuplicates() {
      Node curr = head;
      while (curr != null && curr.next != null) {
          if (curr.data == curr.next.data) {
              curr.next = curr.next.next; // skip duplicate
          } else {
              curr = curr.next; // move forward
          }
      }
  }

  // Function to print the list
  public static void printList() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      addLast(1);
      addLast(1);
      addLast(2);
      addLast(3);
      addLast(3);
      addLast(4);

      System.out.println("Original List:");
      printList();

      removeDuplicates();

      System.out.println("After Removing Duplicates:");
      printList();
  }
}
