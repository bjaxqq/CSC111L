public class UnorderedList {

    private char[] list;
    private int numItems;

    public UnorderedList(int size) {
        list = new char[size];
        numItems = 0;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void addItem(char newItem) {
        list[numItems] = newItem;
        numItems++;
    }

    public void removeItem(int index) {
        for (int i = index; i < numItems - 1; i++) {
            list[i] = list[i+1];
        }
        numItems--;
    }

    public void removeAll() {
        numItems = 0;
    }

    public char getItem(int index) {
        return list[index];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < numItems; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }
    }
}