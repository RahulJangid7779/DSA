public class mergetwosortedll {
  public static Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node merge(Node head1,Node head2){
    Node dummy=new Node(-1);
    Node tail=dummy;
    while(head1!=null && head2!=null){
      if(head1.data<head2.data){
        tail.next=head1;
        head1=head1.next;
      }
      else{
        tail.next=head2;
        head2=head2.next;
      }
      if(head1!=null) tail.next=head1;
      if(head2!=null) tail.next=head2;
      return dummy.next;
    }
    public static void printList(Node head) {
      while (head != null) {
          System.out.print(head.data + " -> ");
          head = head.next;
      }
      System.out.println("null");
  }
    public static void main(String args){
      Node head1 = new Node(1);
      head1.next = new Node(3);
      head1.next.next = new Node(5);
      Node head2 = new Node(2);
      head2.next = new Node(4);
      head2.next.next = new Node(6);
      Node mergedHead=merge(head1,head2);
      System.out.print("Merged list :");
      printList(mergedHead);
      
    }

  }
}
