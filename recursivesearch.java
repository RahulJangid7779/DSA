package linklist;

public class recursivesearch {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public static void addLast(int data) {
        Node lastNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = lastNode;
            return;
        }
        tail.next = lastNode;
        tail = lastNode;
    }

    // Print Linked List
    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Remove First
    public static int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last
    public static int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // ✅ Corrected Recursive Search Function
    public static int helper(Node head, int key) {
        if (head == null) {
            return -1; // Not found  
        }
        if (head.data == key) {
            return 0; // Found at current index
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1; // Not found in rest of list
        }
        return index + 1; // Add 1 to index found in the rest of the list
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]) {
        recursivesearch ll = new recursivesearch();

        ll.addFirst(13);
        ll.addFirst(12);
        ll.addFirst(18);
        ll.printll(); // Output: 18 -> 12 -> 13 -> Null

        int key = 12;
        int index = ll.recSearch(key);
        System.out.println(index != -1 ? "Element found at index: " + index : "Element not found");

        key = 20;
        index = ll.recSearch(key);
        System.out.println(index != -1 ? "Element found at index: " + index : "Element not found");
    }
}
