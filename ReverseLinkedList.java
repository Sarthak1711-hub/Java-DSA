public class ReverseLinkedList {

    static class Node { 
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // =========================================================
    // APPROACH 1: ITERATIVE
    // =========================================================

    static Node reverseIterative(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node forward = current.next;

            current.next = prev;

            prev = current;

            current = forward;
        }

        return prev;
    }

    // =========================================================
    // APPROACH 2: RECURSIVE
    // =========================================================

    static Node reverseRecursive(Node current, Node previousNode) {

        if (current == null) {
            return previousNode;
        }

        Node forward = current.next;

        current.next = previousNode;

        previousNode = current;
        
        current = forward;

        return reverseRecursive(current, previousNode);
    }

    static Node reverseRecursive(Node head) {

        Node current = head;
        Node previousNode = null;

        return reverseRecursive(current, previousNode);
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static Node createList() {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        return head;
    }

    public static void main(String[] args) {

        // -----------------------------------------------------
        // APPROACH 1: ITERATIVE
        // -----------------------------------------------------

        Node head1 = createList();

        System.out.println("Original List:");
        printList(head1);

        head1 = reverseIterative(head1);

        System.out.println("Reversed List (Iterative):");
        printList(head1);

        // -----------------------------------------------------
        // APPROACH 2: RECURSIVE
        // -----------------------------------------------------

        Node head2 = createList();

        System.out.println("\nOriginal List:");
        printList(head2);

        head2 = reverseRecursive(head2);

        System.out.println("Reversed List (Recursive):");
        printList(head2);
    }
}
