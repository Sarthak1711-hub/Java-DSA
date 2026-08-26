public class RemoveFirstNodeofCycle {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node checkCycle(Node head) {

        Node fast = head;
        Node slow = head;
        boolean hasCycle = false;

        while (fast != null) {

            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            if (fast == slow) {
                hasCycle = true;
                System.out.println("Cycle detected");
                break;
            }
        }

        if (hasCycle != true) {
            System.out.println("No cycle found");
            return null;
        }

        slow = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        Node startingNode = slow;

        System.out.println("Cycle starts at node: " + startingNode.data);

        Node temp = startingNode;

        while (temp.next != startingNode) {
            temp = temp.next;
        }

        temp.next = null;

        return startingNode;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        Node result = checkCycle(head);

        System.out.println("Starting node returned: " + result.data);
    }
}