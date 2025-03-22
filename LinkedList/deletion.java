package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int x, Node next) {
        this.data = x;
        this.next = next;

    }

    public Node(int x) {
        data = x;
        next = null;
    }
}

public class deletion {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node deleteNode(Node head) {
        // 2->3->4->5->null

        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = deleteNode(head);
        printLL(head);

    }

}
