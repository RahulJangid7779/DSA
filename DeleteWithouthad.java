class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class deletewithouthead {
    public static void deleteNode(Node nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null) {
            System.out.println("Cannot delete the last node or null node without head");
            return;
        }

        nodeToDelete.data = nodeToDelete.next.data;
        nodeToDelete.next = nodeToDelete.next.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Linked list: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before deletion:");
        printList(head);

        // Let's delete node 3 without head
        deleteNode(head.next.next); // deletes 3

        System.out.println("After deleting node 3:");
        printList(head);
    }
}
