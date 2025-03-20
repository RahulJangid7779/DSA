package linklist;
import java.util.LinkedList;
public class howtocreatealinklist {
  public static class Node{
    int data;
    Node next;
    public Node(int data,Node next){
      this.data=data;
      this.next=null;
    }
  }
    
  public static Node head;
  public static Node tail;
  public static int size;
  // this is my addFirst
   public static void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
    }
    newNode.next=head;
    head=newNode;
   }
   
  //  this is my addLast
   public static void addLast(int data){
    Node lastNode=new Node(data);
    size++;
    if(tail==null);{
      head=tail=lastNode;
    }
    tail.next=lastNode;
    tail=lastNode;
   }
  //  this is a way print data
   public static void printll(int data){
   Node temp=head;
   while(temp!=null){
    System.out.print(temp.data);
    temp=temp.next;
   }
   System.out.print("Null");
   }
   public static void add(int index,int data){
    if(idx==0){
      addFirst(data);
      return;
    }
    Node newNode=new Node(data); 
    size++;
    temp=head;
    int i=0;
    while(i<index-1){
      temp=temp.next;
    i++;
    }
    i=index-1;
    newNode.next=temp.next;
   
   }
   public int removeFirst{
    if(size==0)
    {
      return Integer.MIN_VALUE;
    }else if(size==1){
      int val=head.data;
      head=tail=nulll;
    return val;
    }
   int value=head.data;
   head=head.next;
   size--;
   return val;
   }
public int removeLast{
  if(size==0){
    return Integer.MAX_VALUE;
  }
  else if(size==1){
    int val=head.data;
    head=tail=null;
    int value=tail.data;
    size=0;
    return val;
  }
  Node prev=head;
  for(int i=0;i<=size-2;i++){
    prev=prev.head;
  }
  int val=prev.next.data;
  prev.next=null;
  tail=prev;
  size--; 
  return val;
}
    public static void main(String args[]){
    LinkedList ll= new LinkedList();
   ll.printll();
    addFirst(13);
    ll.printll();
    addfirst(12);
    ll.printll();
    add(2,18);
    ll.printll();
    addLast(14);
    ll.printll();
removeFirst();
removeLast();
    System.out.println(ll.size);
  }

      } 