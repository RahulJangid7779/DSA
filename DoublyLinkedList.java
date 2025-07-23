public class DoublyLinkedList {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;
    private int size;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // Add at index
    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // Remove from beginning
    public int removeFirst() {
        if (size == 0) return Integer.MIN_VALUE;

        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove from end
    public int removeLast() {
        if (size == 0) return Integer.MIN_VALUE;

        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Remove at index
    public int removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return Integer.MIN_VALUE;
        }
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;

        int val = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return val;
    }

    // Search for value
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.data;
    }

    // Print list from head to tail
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print list from tail to head
    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Clear the list
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // MAIN METHOD TO TEST
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addAtIndex(1, 15);

        System.out.println("Print Forward:");
        dll.printForward(); // 10 <-> 15 <-> 20 <-> 30 <-> null

        System.out.println("Print Backward:");
        dll.printBackward(); // 30 <-> 20 <-> 15 <-> 10 <-> null

        System.out.println("Removed First: " + dll.removeFirst()); // 10
        System.out.println("Removed Last: " + dll.removeLast());   // 30
        System.out.println("Removed at index 1: " + dll.removeAtIndex(1)); // 20

        dll.printForward(); // 15 <-> null

        System.out.println("Search 15: " + dll.search(15)); // true
        System.out.println("Search 99: " + dll.search(99)); // false
        System.out.println("Element at index 0: " + dll.get(0)); // 15
        System.out.println("Size: " + dll.getSize()); // 1

        dll.clear();
        dll.printForward(); // null
        System.out.println("Size after clear: " + dll.getSize()); // 0
    }
}
