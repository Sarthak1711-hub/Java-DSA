public class MergeNodesInBetweenZeroes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode mergeNodes(ListNode head) {

        ListNode read = head.next;
        ListNode write = head;

        while (read != null) {
            int sum = 0;
            while(read.val != 0){
                sum = sum+read.val;
                read= read.next;
            }
            write.val = sum;
            write.next = read.next;
            read= read.next;
            write = write.next;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 3, 1, 0, 4, 5, 2, 0 };

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        ListNode result = mergeNodes(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
