public class DeepCopyLinkedList {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }

            // 1. Clone nodes
            Node temp = head;

            while (temp != null) {
                Node cloneNode = new Node(temp.val);
                cloneNode.next = temp.next;
                temp.next = cloneNode;
                temp = cloneNode.next;
            }

            // 2. Copy random pointers
            temp = head;

            while (temp != null) {
                Node cloneNode = temp.next;

                if (temp.random != null) {
                    cloneNode.random = temp.random.next;
                }

                temp = cloneNode.next;
            }

            // 3. Detach the linked lists
            temp = head;
            Node ans = head.next;

            while (temp != null) {
                Node oldNode = temp;
                Node cloneNode = temp.next;
                oldNode.next = cloneNode.next;

                if (cloneNode.next != null) {
                    cloneNode.next = oldNode.next.next;
                }

                temp = temp.next;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node head = n1;

        Solution solution = new Solution();
        Node copiedHead = solution.copyRandomList(head);

        Node curr = copiedHead;
        while (curr != null) {
            System.out.println("Node: " + curr.val + ", Next: " + (curr.next != null ? curr.next.val : "null")
                    + ", Random: " + (curr.random != null ? curr.random.val : "null"));
            curr = curr.next;
        }
    }
}