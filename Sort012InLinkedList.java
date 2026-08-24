public class Sort012InLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node sortList(Node head) {

        Node zeroHead = new Node(0);
        Node zeroTail = zeroHead;

        Node oneHead = new Node(0);
        Node oneTail = oneHead;

        Node twoHead = new Node(0);
        Node twoTail = twoHead;

        Node temp = head;

        while (temp != null) {

            if (temp.data == 0) {
                Node current = temp;
                temp = temp.next;
                zeroTail.next = current;
                zeroTail = current;
            } else if (temp.data == 1) {
                Node current = temp;
                temp = temp.next;
                oneTail.next = current;
                oneTail = current;
            } else if (temp.data == 2) {
                Node current = temp;
                temp = temp.next;
                twoTail.next = current;
                twoTail = current;
            }
        }
        if (oneHead.next != null) {
            zeroTail.next = oneHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }

        oneTail.next = twoHead.next;

        twoTail.next = null;

        zeroHead = zeroHead.next;

        return zeroHead;
    }

    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(0);

        System.out.println("Original List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}
