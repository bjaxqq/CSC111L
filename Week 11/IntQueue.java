public class IntQueue {
    private int[] queue;
    private int front;
    private int back;
    private int count;
    private int size;

    public IntQueue(int maxSize) {
        queue = new int[maxSize];
        front = 0;
        back = -1;
        count = 0;
        size = maxSize;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(int newItem) {
        if (!isFull()) {
            back = (back + 1) % size;
            queue[back] = newItem;
            count++;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int item = queue[front];
            front = (front + 1) % size;
            count--;
            return item;
        }
        return -1;
    }

    public void dequeueAll() {
        front = 0;
        back = -1;
        count = 0;
    }

    public int peek() {
        if (!isEmpty()) {
            return queue[front];
        }
        return -1;
    }

    public void display() {
        System.out.println("Front = " + front);
        System.out.println("Back = " + back);
        System.out.println("Count = " + count);
        System.out.println("Size = " + size);
        System.out.print("Queue --> ");
        for (int index = front; index <= back; index++) {
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}