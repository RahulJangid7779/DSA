import java.util.*;

public class implementqueueusingjavacollectionframework {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();  // removes 1

        while (!q.isEmpty()) {
            System.out.print(q.peek()); // prints the front
            q.remove();                 // removes the front
        }
    }
}
