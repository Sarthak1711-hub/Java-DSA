public class DeleteDuplicateNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node DeleteDuplicate(Node head) {

        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if (current.data != previous.data) {
                previous = previous.next;
                current = current.next;
            } else {
                previous.next = current.next;
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);

        Node temp = DeleteDuplicate(head);

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
