public class QueueBasics {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        // enqueueing 1 2 3 4 5
        System.out.println("Enqueueing 1 2 3 4 5...");
        System.out.println();
        queue.enqueue(1);
        System.out.println("Enqueue...");
        queue.display();
        queue.enqueue(2);
        System.out.println("Enqueue...");
        queue.display();
        queue.enqueue(3);
        System.out.println("Enqueue...");
        queue.display();
        queue.enqueue(4);
        System.out.println("Enqueue...");
        queue.display();
        System.out.println("Enqueue...");
        queue.enqueue(5);
        queue.display();
        System.out.println("Display : ");
        System.out.println("Is Queue Empty? : " + queue.isEmpty());
        queue.display();

        System.out.println("First Element : " + queue.peakFirst());
        System.out.println("Last Element : " + queue.peakLast());

        // Dequeueing ...

        System.out.println("Dequeue...");
        queue.dequeue();
        queue.display();
        System.out.println("Dequeue...");
        queue.dequeue();
        queue.display();
        System.out.println("Dequeue...");
        queue.dequeue();
        queue.display();
        System.out.println("Dequeue...");
        queue.dequeue();
        queue.display();
        System.out.println("Dequeue...");
        queue.dequeue();
        queue.display();
        System.out.println("Is Queue Empty? : " + queue.isEmpty());
    }
}

class QueueUsingArray {
    static int rear, front;
    static int size;
    static int[] queue;

    QueueUsingArray(int capacity) {
        size = capacity;
        rear = 0;
        front = 0;
        queue = new int[size];
    }

    void enqueue(int element) {
        if (rear == size) {
            System.out.println("Queue is Already full!");
        } else {
            queue[rear] = element;
            rear++;
        }
    }

    void dequeue() {
        if (rear == 0) {
            System.out.println("Queue is Empty!");
        } else {
            rear--;
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
        }
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void display() {
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    int peakFirst() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return 0;
        } else {
            return queue[front];
        }
    }

    int peakLast() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return 0;
        } else {
            return queue[rear - 1];
        }
    }

}