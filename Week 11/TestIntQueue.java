// Test Integer Queue
// 
// Mark Hoffman
// July 20, 2014
//
// Test array-based implementation of a circular queue

public class TestIntQueue {
    public static void main(String[] args) {

        System.out.println("Create new queue size 5");

        IntQueue q = new IntQueue(5);

        q.display();

        System.out.println("------------------------");

        System.out.println("Add '1' and '2'");

        q.enqueue(1);
        q.enqueue(2);

        q.display();

        System.out.println("------------------------");

        System.out.println("Dequeue item " + q.dequeue());

        q.display();

        System.out.println("------------------------");

        System.out.println("Add '9', '11', and '1'");

        q.enqueue(9);
        q.enqueue(11);
        q.enqueue(1);

        q.display();

        System.out.println("------------------------");

        System.out.println("Dequeue items " + q.dequeue() + " and " + q.dequeue());

        q.display();

        System.out.println("------------------------");

        System.out.println("Add '78', '4', and '39'");

        q.enqueue(78);
        q.enqueue(4);
        q.enqueue(39);

        q.display();

        System.out.println("------------------------");

        System.out.println("Add '6'");

        q.enqueue(6);

        q.display();

        System.out.println("------------------------");

        System.out.println("Dequeue items " + q.dequeue() + " and " + q.dequeue());

        q.display();

        System.out.println("------------------------");

        System.out.println("Dequeue all items");

        q.dequeueAll();

        q.display();

        System.out.println("------------------------");

        System.out.println("Dequeue item " + q.dequeue());

        q.display();

        System.out.println("------------------------");

    }
}