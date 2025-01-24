class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class ReverseDLL {
    public DLLNode reverseDLL(DLLNode head) {
        if (head.next == null) {
            return head;
        }

        DLLNode current = head;
        DLLNode last = current.prev;

        while (current!=null) {
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }

        return last.prev;
    }
}
