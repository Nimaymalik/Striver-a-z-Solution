package LinkedList;

import java.util.Arrays;
import java.util.List;

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

public class Insertion {

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node insertNode(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = insertNode(head, 100);
        printLL(head);

    }
}