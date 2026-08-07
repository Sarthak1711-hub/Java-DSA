public class UpdateValueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public UpdateValueLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtTail(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;

    }

    public void updateValue(int position, int newData) {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        if (position < 1 || position > size) {
            System.out.println("Invalid Position.");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        System.out.println("Node at Position " + position + " : " + temp.data);

        temp.data = newData;

        System.out.println("Updated Value : " + temp.data);
    }

    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        UpdateValueLinkedList list = new UpdateValueLinkedList();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.println("Original Linked List");
        list.display();

        list.updateValue(3, 99);

        System.out.println("Updated Linked List");
        list.display();
    }
}