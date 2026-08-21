public class IntersectionOfLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }
        if (a == null) {
            int bLen = 0;

            while (b != null) {
                bLen++;
                b = b.next;
            }

            while (bLen > 0) {
                headB = headB.next;
                bLen--;
            }
        } else {
            int aLen = 0;

            while (a != null) {
                aLen++;
                a = a.next;
            }

            while (aLen > 0) {
                headA = headA.next;
                aLen--;
            }
        }

        while (headA != null && headB != null) {
            if (headA.val == headB.val) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next = new ListNode(10);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(10);

        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
