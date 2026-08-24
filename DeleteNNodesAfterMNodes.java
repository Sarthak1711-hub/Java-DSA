public class DeleteNNodesAfterMNodes {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node deleteNodes(Node head, int M, int N) {

        Node temp = null;
        Node current = head;

        while (current != null) {

            for (int i = 1; i <= M && current != null; i++) {
                temp = current;
                current = current.next;
            }
            if (current == null) {
                return head;
            }
            for (int j = 1; j <= N && current != null; j++) {

                current = current.next;
            }
            temp.next = current;
        }

        return head;
    }

    static void printList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 10; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        int M = 2;
        int N = 3;

        head = deleteNodes(head, M, N);

        printList(head);
    }
}