class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SplitLinkedListIntoParts {

    public static Node[] splitListToParts(Node head, int k) {

        Node curr = head;
        Node prev = null;
        Node temp = head;
        int len = 0;

        Node[] ans = new Node[k];
        int index = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int baseSize = len / k;
        int extraNodes = len % k;

        for (int i = 1; i <= k; i++) {

            ans[index] = curr;
            index++;

            if (curr == null) {
                continue;
            }

            int width = baseSize;

            if (extraNodes > 0) {
                width = baseSize + 1;
                extraNodes--;
            }
            for (int j = 1; j <= width; j++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            prev = null;

        }

        return ans;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        int k = 3;

        System.out.println("Original List:");
        printList(head);

        Node[] result = splitListToParts(head, k);

        System.out.println("Split Parts:");

        for (int i = 0; i < k; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            printList(result[i]);
        }
    }
}