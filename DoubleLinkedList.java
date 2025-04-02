public class DoubleLinkedList {
  public class Node {
      int data;
      Node next;
      Node prev;

      public Node(int data) {
          this.data = data;
          this.next = null;
          this.prev = null;
      }
  }

  private Node head;
  private Node tail;
  private int size;

  public DoubleLinkedList() {
      this.head = null;
      this.tail = null;
      this.size = 0;
  }

  // AddFirst method
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

  // Print method
  public void print() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " <-> ");
          temp = temp.next;
      }
      System.out.println("null");
  }

  // RemoveFirst method
  public int removeFirst() {
      if (head == null) {
          System.out.println("DLL is empty");
          return Integer.MIN_VALUE;
      }
      if (size == 1) {
          int val = head.data;
          head = tail = null;
          size--;
          return val;
      }
      int val = head.data;
      head = head.next;
      head.prev = null;
      size--;
      return val;
  }

  public int getSize() {
      return size;
  }

  public static void main(String args[]) {
      DoubleLinkedList dll = new DoubleLinkedList();
      dll.addFirst(3);
      dll.addFirst(2);
      dll.addFirst(1);
      
      dll.print();
      System.out.println("Size: " + dll.getSize());

      dll.removeFirst();
      dll.print();
      System.out.println("Size: " + dll.getSize());
  }
}
