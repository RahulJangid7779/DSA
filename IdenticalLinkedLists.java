class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IdenticalLinkedLists {

    // Function to check if two linked lists are identical
    public static boolean areIdentical(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false; // Data mismatch
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // If both are null at end, they are identical
        return (temp1 == null && temp2 == null);
    }

    public static void main(String[] args) {
        // First list: 1 -> 2 -> 3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Second list: 1 -> 2 -> 3
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        boolean result = areIdentical(head1, head2);
        System.out.println("Are the linked lists identical? " + result);
    }
}
