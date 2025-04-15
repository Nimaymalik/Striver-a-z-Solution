
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

}

public class FindLength {
    public static int traversal(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;

        }
        return len;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7, 9 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        System.out.println(traversal(head));

    }

}
