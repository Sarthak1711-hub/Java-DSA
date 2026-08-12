public class MergeTwoSortedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node head1, Node head2) {

        // Handle empty lists
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node current1 = head1;
        Node current2 = head2;
        Node head;
        Node previous;

        // Decide the first node of merged list
        if (head1.data < head2.data) {
            head = head1;
            previous = head1;
            current1 = current1.next;
        } else {
            head = head2;
            previous = head2;
            current2 = current2.next;
        }

        // Merge while both lists have nodes
        while (current1 != null && current2 != null) {

            if (current1.data < current2.data) {

                previous.next = current1;
                current1 = current1.next;

            } else {

                previous.next = current2;
                current2 = current2.next;
            }

            previous = previous.next;
        }

        // Attach remaining nodes
        if (current1 != null) {
            previous.next = current1;
        } else {
            previous.next = current2;
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedHead = merge(head1, head2);

        printList(mergedHead);
    }
}