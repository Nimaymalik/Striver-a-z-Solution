package LinkedList.Problems;

class Node {
    int data;
    Node next;

    Node(int x, Node next) {
        this.data = x;
        this.next = next;

    }

    Node(int x) {
        data = x;
        next = null;
    }
}

public class FindMiddle {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printLL(head);
        System.out.println(findMidNode(head).data);

    }

}
