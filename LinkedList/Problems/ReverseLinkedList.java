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

public class ReverseLinkedList {
    public static Node reverseLL(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;

    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head=reverseLL(head);
        printLL(head);

    }
}
