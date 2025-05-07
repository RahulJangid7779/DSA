import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            q1.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // Move elements to q2 except last one
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int top = q1.remove(); // last element = top of stack

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int top = q1.remove();
            q2.add(top); // put it back

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(21);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
