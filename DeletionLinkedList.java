public class DeletionLinkedList {

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

    public DeletionLinkedList() {
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

    public void deleteHead() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        System.out.println("Deleted Head Node : " + head.data);

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteTail() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        System.out.println("Deleted Tail Node : " + tail.data);

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtPosition(int position) {

        if (position < 1 || position > size) {
            System.out.println("Invalid Position.");
            return;
        }

        if (position == 1) {
            deleteHead();
            return;
        }

        if (position == size) {
            deleteTail();
            return;
        }

        Node previous = head;

        for (int i = 1; i < position - 1; i++) {
            previous = previous.next;
        }

        Node current = previous.next;

        System.out.println("Deleted Node at Position " + position + " : " + current.data);

        previous.next = current.next;
        current.next = null;

        size--;
    }

    public void display() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;

        System.out.print("Linked List : ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
        System.out.println("Size : " + size);
        System.out.println();
    }

    public static void main(String[] args) {

        DeletionLinkedList list = new DeletionLinkedList();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.println("Original Linked List");
        list.display();

        list.deleteHead();
        list.display();

        list.deleteTail();
        list.display();

        list.deleteAtPosition(2);
        list.display();
    }
}