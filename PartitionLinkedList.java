class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PartitionLinkedList {

    public static Node partition(Node head, int x) {

        Node LessHead = new Node(-1);
        Node LessTail = LessHead;
        Node GreaterHead = new Node(-1);
        Node GreaterTail = GreaterHead;

        Node temp = head;

        while(temp!=null){
            if(temp.val<x){
                Node NodeToInsert = temp;
                temp=temp.next;
                NodeToInsert.next=null;
                LessTail.next = NodeToInsert;
                LessTail = LessTail.next;
            }
            else{
                Node NodeToInsert = temp;
                temp=temp.next;
                NodeToInsert.next=null;
                GreaterTail.next = NodeToInsert;
                 GreaterTail = GreaterTail.next;
            }
        }
        LessTail.next=GreaterHead.next;
        LessHead=LessHead.next;


        return LessHead;
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

        int[] arr = {1, 4, 3, 2, 5, 2};

        // Create Linked List using loop
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        int x = 3;

        System.out.println("Original List:");
        printList(head);

        Node result = partition(head, x);

        System.out.println("Partitioned List:");
        printList(result);
    }
}