public class InsertionDoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public InsertionDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            System.out.println("Inserted " + data + " at head.");
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

        System.out.println("Inserted " + data + " at head.");
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            System.out.println("Inserted " + data + " at tail.");
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;

        System.out.println("Inserted " + data + " at tail.");
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;
        Node forward = head;

        if (position == 0) {
            insertAtHead(data);
            return;
        }

        if (position == size) {
            insertAtTail(data);
            return;
        }

        for (int i = 0; i <= position - 1; i++) {
            temp = temp.next;
        }

        forward = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = forward;
        forward.prev = newNode;
        size++;

        System.out.println(
                "Inserted " + data + " at position " + position + ".");
    }

    public void displayForward() {
        Node temp = head;

        System.out.println("\nForward Traversal:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayBackward() {
        Node temp = tail;

        System.out.println("\nBackward Traversal:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        InsertionDoublyLinkedList list = new InsertionDoublyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);

        list.insertAtPosition(35, 3);

        list.displayForward();
        list.displayBackward();

        System.out.println("\nSize of list: " + list.getSize());
    }
}