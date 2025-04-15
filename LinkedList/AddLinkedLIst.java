class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

}

public class AddLinkedLIst {

    public static ListNode add(ListNode h1, ListNode h2) {
        ListNode rev1 = reverse(h1);
        ListNode rev2 = reverse(h2);

        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;

        while (rev1 != null || rev2 != null) {
            int sum = carry;

            if (rev1 != null) {
                sum += rev1.data;
                rev1 = rev1.next;

            }
            if (rev2 != null) {
                sum += rev2.data;
                rev2 = rev2.next;

            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

        }
        return temp.next;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;

        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while (curr != null) {

            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }

        }
        return prev;

    }

    // printing the Linked List
    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // first Linked List
        ListNode h1 = new ListNode(1);
        h1.next = new ListNode(2);
        h1.next.next = new ListNode(3);

        // second Linked List
        ListNode h2 = new ListNode(4);
        h2.next = new ListNode(5);
        h2.next.next = new ListNode(6);

        ListNode print = add(h1, h2);

        printLL(reverse(print));

    }

}
