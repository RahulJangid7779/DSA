package linklist;

public class howtocreatealinklist {
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

    // Add at Index
    public static void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
 
    public static void main(String args[]) {
        howtocreatealinklist ll = new howtocreatealinklist();

        ll.addFirst(13);
        ll.printll();

        ll.addFirst(12);
        ll.printll();

        ll.add(2, 18);
        ll.printll();

        ll.addLast(14);
        ll.printll();

        ll.removeFirst();
        ll.printll();

        ll.removeLast();
        ll.printll();

        System.out.println("Size: " + ll.size);
    }
}
