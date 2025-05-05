public class ImplementQueueUsingArray {

  public static class Queue {
      int[] arr;
      int size;
      int rear;

      Queue(int n) {
          arr = new int[n];
          size = n;
          rear = -1;
      }

      public boolean isEmpty() {
          return rear == -1;
      }

      public void enqueue(int data) {
          if (rear == size - 1) {
              System.out.println("Queue is full");
              return;
          }
          rear++;
          arr[rear] = data;
      }

      public int dequeue() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          int front = arr[0];
          // Shift all elements to the left
          for (int i = 0; i < rear; i++) {
              arr[i] = arr[i + 1];
          }
          rear--;
          return front;
      }

      public int peek() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          return arr[0];
      }
  }

  public static void main(String[] args) {
      Queue q = new Queue(5);

      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);

      System.out.println("Dequeued: " + q.dequeue());
      System.out.println("Front element: " + q.peek());
  }
}
