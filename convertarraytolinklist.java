public class convertlinklisttoarray {

  // Define Node class
  public static class Node {
      int data;
      Node next;

      public Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  // Convert array to linked list and return head
  public static Node arrayToLinkedList(int[] arr) {
      if (arr.length == 0) return null;

      Node head = new Node(arr[0]); 
      Node current = head;

      for (int i = 1; i < arr.length; i++) {
          current.next = new Node(arr[i]); // Add next node
          current = current.next;
      }
      return head;
  }

  // Print linked list
  public static void printLinkedList(Node head) {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
      int[] arr = {10, 20, 30, 40, 50};

      Node head = arrayToLinkedList(arr);

      System.out.print("Linked List: ");
      printLinkedList(head);
  }
}