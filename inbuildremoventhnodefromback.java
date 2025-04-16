import java.util.LinkedList;

public class RemoveNthFromEndInbuilt {

    public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
        int size = list.size();
        if (n > size) {
            System.out.println("List has fewer than " + n + " elements.");
            return;
        }
        // Index to remove: (size - n)
        list.remove(size - n);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        int n = 2;
        removeNthFromEnd(list, n);

        System.out.println("After removing " + n + "th node from the end: " + list);
    }
}
