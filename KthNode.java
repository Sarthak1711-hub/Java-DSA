public class KthNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void kNode(Node head, int k) {

        int count = 1;
        Node temp = head;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        int finalAns = count - k + 1;
        System.out.println(finalAns);
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int k = 1;
        kNode(head, k);
    }
}
