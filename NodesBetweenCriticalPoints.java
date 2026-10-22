
import java.util.*;

public class NodesBetweenCriticalPoints {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        System.out.println("Starting critical point detection...");

        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("Linked list has fewer than 3 nodes.");
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode current = head.next;

        int pos = 1;

        List<Integer> criticalPoints = new ArrayList<>();

        while (current.next != null) {

            System.out.println("\nChecking position: " + (pos + 1));
            System.out.println("Previous value: " + prev.val);
            System.out.println("Current value: " + current.val);
            System.out.println("Next value: " + current.next.val);

            if (current.val < prev.val && current.val < current.next.val) {
                System.out.println("Local minimum found at position " + (pos + 1));
                criticalPoints.add(pos);
            } 
            else if (current.val > prev.val && current.val > current.next.val) {
                System.out.println("Local maximum found at position " + (pos + 1));
                criticalPoints.add(pos);
            } 
            else {
                System.out.println("Not a critical point.");
            }

            current = current.next;
            prev = prev.next;
            pos++;
        }

        System.out.println("\nCritical point positions: " + criticalPoints);

        if (criticalPoints.size() < 2) {
            System.out.println("Fewer than 2 critical points found.");
            return new int[]{-1, -1};
        }

        int minDistance = Integer.MAX_VALUE;

        for (int j = 1; j < criticalPoints.size(); j++) {

            int distance = criticalPoints.get(j) - criticalPoints.get(j - 1);

            System.out.println("Distance between positions " + criticalPoints.get(j - 1) + " and " + criticalPoints.get(j) + " = " + distance
            );

            minDistance = Math.min(minDistance, distance);
            System.out.println("Current minimum distance: " + minDistance);
        }

        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        System.out.println("\nMinimum distance: " + minDistance);
        System.out.println("Maximum distance: " + maxDistance);

        return new int[]{minDistance, maxDistance};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter " + n + " node values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("\nLinked list created successfully!");

        System.out.print("Linked list: ");
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");

        NodesBetweenCriticalPoints solution = new NodesBetweenCriticalPoints();

        int[] result = solution.nodesBetweenCriticalPoints(head);

        System.out.println("\nFinal result: " + Arrays.toString(result));

        sc.close();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
