public class FlattenMultiLevelLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode previous;
        ListNode child;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.previous = null;
            this.child = null;
        }

        ListNode(int val, ListNode next, ListNode previous, ListNode child) {
            this.val = val;
            this.next = next;
            this.previous = previous;
            this.child = child;
        }
    }

    public ListNode flattenList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode p = head;

        while (p != null) {
            if (p.child == null) {
                p = p.next;
            } else {
                ListNode temp = p.child;

                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = p.next;
                if (p.next != null) {

                    p.next.previous = temp;
                }
                p.next = p.child;
                p.child.previous = p;
                p.child = null;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        FlattenMultiLevelLL solution = new FlattenMultiLevelLL();

        // Main list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        ListNode head = new ListNode(1);
        ListNode current = head;

        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current.next.previous = current;
            current = current.next;
        }

        // Child list of node 3: 6 <-> 7 <-> 8
        ListNode node3 = head.next.next;

        node3.child = new ListNode(6);
        current = node3.child;

        for (int i = 7; i <= 8; i++) {
            current.next = new ListNode(i);
            current.next.previous = current;
            current = current.next;
        }

        // Child list of node 7: 9 <-> 10
        ListNode node7 = node3.child.next;

        node7.child = new ListNode(9);
        node7.child.next = new ListNode(10);
        node7.child.next.previous = node7.child;

        // Flatten the multilevel doubly linked list
        head = solution.flattenList(head);

        // Print forward
        System.out.println("Forward:");
        current = head;

        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.next;
        }
        System.out.println("null");

        // Print backward
        System.out.println("Backward:");
        current = head;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.previous;
        }
        System.out.println("null");
    }
}