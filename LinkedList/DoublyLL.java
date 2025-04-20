class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;

    }

}

public class DoublyLL {
    public static boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        while (head != tail && head.next != tail) {
            if (head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }

        return true;
    }

    public static ListNode create(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;

        }
        return head;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 2, 1 };

        ListNode ll = create(arr1);
        System.out.println(isPalindrome(ll));

    }

}
