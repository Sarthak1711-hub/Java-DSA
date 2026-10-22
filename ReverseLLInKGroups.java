public class ReverseLLInKGroups {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (length < k) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        for (int i = 1; i <= k; i++) {

            ListNode forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        ListNode ans = reverseKGroup(current, k);
        head.next = ans;
        return previous;
    }

    public static void main(String[] args) {
        ReverseLLInKGroups solution = new ReverseLLInKGroups();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 3;

        head = solution.reverseKGroup(head, k);

        // Print linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}