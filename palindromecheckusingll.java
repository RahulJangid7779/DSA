package linklist;

public class palindromecheckusingll {
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

    // Print Linked List
    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Find Middle of Linked List
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check if Linked List is Palindrome
    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;  // Empty or single-node LL is always palindrome
        }

        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Reverse second half
        Node prev = null;
        Node current = midNode;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;  // Right half reversed
        Node left = head;   // Left half unchanged

        // Step 3: Compare both halves
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {
        palindromecheckusingll ll = new palindromecheckusingll();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printll();  // Output: 1 -> 2 -> 2 -> 1 -> Null

        System.out.println("Is Palindrome? " + checkPalindrome());  // Output: true
    }
}
