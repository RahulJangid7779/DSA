
public class deleteaternativenode {
  class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // Function to delete alternate nodes
    public static void deleteAlternate(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            // Skip the next node
            current.next = current.next.next;
            // Move to the next kept node
            current = current.next;
        }
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        deleteAlternate(head);

        System.out.println("After deleting alternate nodes:");
        printList(head);
    }
}
