public class RemoveCycle {
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

  // Detect cycle
  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  // Remove cycle
  public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (!cycle) return;

    // Reset slow to head
    slow = head;
    Node prev = null;

    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // Remove cycle
    prev.next = null;
  }

  // Print list
  public static void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head.next; // cycle created: 4 → 2

    System.out.println("Cycle Present? " + isCycle()); // true

    removeCycle();

    System.out.println("Cycle Present After Removal? " + isCycle()); // false

    System.out.println("Linked List After Removing Cycle:");
    printList(); // should print list normally
  }
}
public class RemoveCycle {
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

  // Detect cycle
  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  // Remove cycle
  public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (!cycle) return;

    // Reset slow to head
    slow = head;
    Node prev = null;

    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // Remove cycle
    prev.next = null;
  }

  // Print list
  public static void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head.next; // cycle created: 4 → 2

    System.out.println("Cycle Present? " + isCycle()); // true

    removeCycle();

    System.out.println("Cycle Present After Removal? " + isCycle()); // false

    System.out.println("Linked List After Removing Cycle:");
    printList(); // should print list normally
  }
}
