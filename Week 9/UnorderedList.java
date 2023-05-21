public class UnorderedList {
    private Node head;
    private int size;

    public UnorderedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(char newItem) {
        Node newNode = new Node(newItem);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node previous = getNode(index - 1);
            Node current = previous.getNext();
            previous.setNext(current.getNext());
        }
        size--;
    }

    public void removeAll() {
        head = null;
        size = 0;
    }

    public char get(int index) {
        Node node = getNode(index);
        return node.getItem();
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getItem() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}