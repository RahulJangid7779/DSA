public class implementcircularqueue {
  public static class Queue {
      int[] arr;
      int size;
      int front;
      int rear;

      Queue(int n) {
          arr = new int[n];
          size = n;
          front = -1;
          rear = -1;
      }

      public boolean isEmpty() {
          return front == -1 && rear == -1;
      }

      public boolean isFull() {
          return (rear + 1) % size == front;
      }

      public void enqueue(int data) {
          if (isFull()) {
              System.out.println("Queue is full");
              return;
          }
          if (front==-1) {
              front = 0;
          }
          rear = (rear + 1) % size;
          arr[rear] = data;
      }

      public int dequeue() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          int result = arr[front];
          if (front == rear) {
              // Only one element
              front = rear = -1;
          } else {
              front = (front + 1) % size;
          }
          return result;
      }

      public int peek() {
          if (isEmpty()) {
              System.out.println("Queue is empty");
              return -1;
          }
          return arr[front];
      }
  }

  public static void main(String[] args) {
      Queue q = new Queue(5);
      q.enqueue(1);
      q.enqueue(2);
      q.dequeue();     // removes 1
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);
      q.dequeue();  
      q.enqueue(6);    // Should show "Queue is full"
      q.enqueue(7);  
      while (!q.isEmpty()) {
          System.out.print(q.peek() + " ");
          q.dequeue();
      }
  }
}

