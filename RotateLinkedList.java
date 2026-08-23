public class RotateLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        ListNode current = head;
        ListNode forward = head;
        ListNode temp = head;
        int count = 0;
        
        if (head == null || head.next == null) {
            return head;
        }

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;

        if (k == 0) {
            return head;
        }

        for (int i = 0; i < k; i++) {
            forward = forward.next;
        }

        while (forward.next != null) {
            current = current.next;
            forward = forward.next;
        }

        ListNode newHead = current.next;

        current.next = null;
        forward.next = head;

        return newHead;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original List:");
        printList(head);

        head = rotateRight(head, k);

        System.out.println("After Rotating " + k + " times:");
        printList(head);
    }
}