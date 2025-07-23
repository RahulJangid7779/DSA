
import java.util.ArrayList;
import java.util.List;

public class convertarraytolinklist {
  public class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
    public static List<Integer> converttoarray(Node head){
      List<Integer> arr= new ArrayList<>();
      Node temp=head;
      while(temp!=null){
arr.add(temp.data);
temp=temp.next;
      }
      return arr;
    }
    public static void main(String args[]){
      Node head=new Node(1);
      head.next=new Node(2);
      head.next.next=new Node(3);
      head.next.next.next=new Node(4);
       List<Integer> arr = converttoarray(head);
        System.out.println("Array: " + arr);
    }
  }
}
