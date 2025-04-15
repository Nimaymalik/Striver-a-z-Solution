package Problems;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;

    }

    Node(int data) {
        this.data = data;
    }
}

public class DetectingLoop {

    public static boolean detectloop(Node head) {
        // Node temp = head;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
            head = head.next;

        }
        return false;
    }

    public static Node wheredetectloop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow=head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
            }

        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node foruth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eight = new Node(8);
        Node ninth = new Node(9);
        head.next = second;
        second.next = third;
        third.next = foruth;
        foruth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;
        ninth.next = third;

        // System.out.println(detectloop(head));
        System.out.println(wheredetectloop(head));

    }

}
