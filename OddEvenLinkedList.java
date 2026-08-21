public class OddEvenLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode OddEven(ListNode head) {

        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;

        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        oddTail.next = evenHead;

        return oddHead;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        ListNode result = OddEven(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
