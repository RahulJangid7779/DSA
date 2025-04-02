import java.util.LinkedList;
public class zigzagll{
public void zigzag(){
  // Find MID
  Node slow=head;
  Node fast=head.next;
while(fast!=null && fast.next!=null){
  slow=slow.next;
  fast=fast.next.next;
}
Node mid= slow;

// /REVERSE SECOND HALF
Node curr=mid.next;
mid.next=null;
Node prev=null;
Node next;
while(curr!=null){
  next=curr.next;
  curr.next=prev;
  prev=curr;
  curr=next;
}
// ZIG ZAG CONDITION
Node left=head;
Node rigth=prev;
Node next;
Node rigth;
while(next!=null && right!=null){
  nextL=left.next;
  left.next=rigth;
  rigth.next=nextL;
  left=nextL;
  rigth=nextR;

}
}
public static void main(String[] args) {
  LinkedList ll= new LinkedList<>();
  ll.addLast(1);
  ll.addLast(2);
  ll.addLast(3);
  ll.addLast(4);
  ll.addLast(5);
  ll.print();
  ll.zigzag();
  ll.print();
}
}