public class InsertionLinkedList {

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

    public InsertionLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
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

    public void insertAtPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Insertion not possible.");
            return;
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        Node previous = head;

        for (int i = 1; i < position - 1; i++) {
            previous = previous.next;
        }

        newNode.next = previous.next;
        previous.next = newNode;

        size++;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        InsertionLinkedList list = new InsertionLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);

        list.insertAtTail(30);
        list.insertAtTail(40);

        list.insertAtPosition(3, 25);

        list.display();
    }
}