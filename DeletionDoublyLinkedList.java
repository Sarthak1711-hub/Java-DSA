public class DeletionDoublyLinkedList {

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

    public DeletionDoublyLinkedList() {
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

    public void displayForward() {
        Node current = head;

        System.out.println("\nForward Traversal:");

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void displayBackward() {
        Node current = tail;

        System.out.println("\nBackward Traversal:");

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("Cannot delete. List is empty.");
            return;
        }

        Node nodeToDelete = head;

        if (head == tail) {
            head = null;
            tail = null;
            size--;

            System.out.println("Deleted " + nodeToDelete.data + " from head.");
            return;
        }

        head = head.next;
        head.prev = null;
        nodeToDelete.next = null;
        size--;

        System.out.println("Deleted " + nodeToDelete.data + " from head.");
    }

    public void deleteAtTail() {
        if (tail == null) {
            System.out.println("Cannot delete. List is empty.");
            return;
        }

        Node nodeToDelete = tail;

        if (head == tail) {
            head = null;
            tail = null;
            size--;

            System.out.println("Deleted " + nodeToDelete.data + " from tail.");
            return;
        }

        tail = tail.prev;
        tail.next = null;
        nodeToDelete.prev = null;
        size--;

        System.out.println("Deleted " + nodeToDelete.data + " from tail.");
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position: " + position);
            return;
        }

        if (position == 0) {
            deleteAtHead();
            return;
        }

        if (position == size - 1) {
            deleteAtTail();
            return;
        }

        Node current = head;

        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        Node previousNode = current.prev;
        Node nextNode = current.next;

        previousNode.next = nextNode;
        nextNode.prev = previousNode;

        current.prev = null;
        current.next = null;
        size--;

        System.out.println("Deleted " + current.data + " from position " + position + ".");
    }

    public void deleteByValue(int target) {
        if (head == null) {
            System.out.println("Cannot delete. List is empty.");
            return;
        }

        Node current = head;

        if (current.data == target) {
            deleteAtHead();
            return;
        }

        while (current != null) {

            if (current.data == target) {

                if (current == tail) {
                    deleteAtTail();
                    return;
                }

                Node previousNode = current.prev;
                Node nextNode = current.next;

                previousNode.next = nextNode;
                nextNode.prev = previousNode;

                current.prev = null;
                current.next = null;
                size--;

                System.out.println("Deleted first occurrence of " + target + ".");

                return;
            }

            current = current.next;
        }

        System.out.println("Value " + target + " not found.");
    }

    public boolean search(int target) {
        Node current = head;

        while (current != null) {

            if (current.data == target) {
                System.out.println("Data " + target + " found.");
                return true;
            }

            current = current.next;
        }

        System.out.println("Data " + target + " not found.");
        return false;
    }

    public void update(int oldValue, int newValue) {
        Node current = head;
        boolean updated = false;

        while (current != null) {

            if (current.data == oldValue) {
                current.data = newValue;
                updated = true;
            }

            current = current.next;
        }

        if (updated) {
            System.out.println("Updated " + oldValue + " to " + newValue + ".");
        } else {
            System.out.println("Value " + oldValue + " not found. Nothing updated.");
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        DeletionDoublyLinkedList list = new DeletionDoublyLinkedList();

        System.out.println("=== INSERTION ===");

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);

        list.displayForward();
        list.displayBackward();

        System.out.println("\nCurrent Size: " + list.getSize());

        System.out.println("\n=== DELETE AT HEAD ===");

        list.deleteAtHead();

        list.displayForward();
        list.displayBackward();

        System.out.println("Current Size: " + list.getSize());

        System.out.println("\n=== DELETE AT TAIL ===");

        list.deleteAtTail();

        list.displayForward();
        list.displayBackward();

        System.out.println("Current Size: " + list.getSize());

        System.out.println("\n=== DELETE AT POSITION ===");

        list.deleteAtPosition(2);

        list.displayForward();
        list.displayBackward();

        System.out.println("Current Size: " + list.getSize());

        System.out.println("\n=== DELETE BY VALUE ===");

        list.deleteByValue(30);

        list.displayForward();
        list.displayBackward();

        System.out.println("Current Size: " + list.getSize());

        System.out.println("\n=== SEARCH ===");

        list.search(40);
        list.search(100);

        System.out.println("\n=== UPDATE ===");

        list.update(40, 45);

        list.displayForward();
        list.displayBackward();

        System.out.println("Current Size: " + list.getSize());
    }
}