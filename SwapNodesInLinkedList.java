public class SwapNodesInLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode second = head;
        ListNode current = head;

        int count = 0;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        while (current != null) {
            count++;
            current = current.next;

        }

        for (int i = 1; i <= count - k; i++) {
            second = second.next;
        }
        int value = first.val;
        first.val = second.val;
        second.val = value;

        return head;
    }

    static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
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

        head = swapNodes(head, k);

        System.out.println("After Swapping:");
        printList(head);
    }
}