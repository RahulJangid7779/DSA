import java.util.LinkedList;
public class linklistinjavacollectionframework {
  public static void main(String[] args) {
    // create - we store object in linkedlist not build in datatype like int float etc we store class like Integer,Float,Boolean etc
    LinkedList<Integer> ll=new LinkedList<>();
    // add
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(0);
    System.out.print(ll);
    // remove
    ll.removeLast();
    ll.removeFirst();
  System.out.println(ll  );
  }
}
