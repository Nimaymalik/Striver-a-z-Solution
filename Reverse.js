function reverseLL(head) {
    if (head == null) {
        return head;
    }
    let prev = null;
    let present = head;
    let next = present.next;

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

// deteching cycle
function detectloop(head) {
    // Node temp = head;
    let fast = head;
    let slow = head;

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
function detectloop(head) {
    let fast = head;
    let slow = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            slow = head;

            while (slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }

        }

    }
    return slow;
}

function add(list1,list2){
  let newlist=new Node(0);



}

