public class PalindromeLinkedList {

    public static class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node midPoint(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }

    public static Node reverse(Node temp) {

        Node previous = null;
        Node current = temp;

        while (current != null) {

            Node forward = current.next;

            current.next = previous;

            previous = current;

            current = forward;
            System.out.println("previous points to: " + previous.data);
        }
        return previous;
    }

    public static boolean checkPalindrome(Node head) {

        // 1. break from mid point
        Node mid = midPoint(head);

        // 2. separate the linked list from mid
        Node temp = mid.next;
        mid.next = null;

        // 3. reverse the linked list

        // 4. compare the data from 2 halves
        if (head == null || head.next == null) {
            return true;
        }

        Node first = head;
        Node second = reverse(temp);

        while (first != null && second != null) {
            if (first.data == second.data) {
                first = first.next;
                second = second.next;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);

        System.out.println(checkPalindrome(head));
    }
}
