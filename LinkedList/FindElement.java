
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

public class FindElement {

    public static boolean find(Node head, int element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) {
                return true;

            }
            temp = temp.next;
        }
        return false;

    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        System.out.println(find(head, 9));

    }

}
