
public class Segregate012 {
    public ListNode segregate(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode zero = null;
        ListNode one = null;
        ListNode two = null;
        ListNode temp = head;
        ListNode zeroHead = null;
        ListNode oneHead = null;
        ListNode twoHead = null;

        while (temp != null) {
            if (temp.val == 0) {
                if (zero == null) {
                    zero = temp;
                    zeroHead = zero;
                } else {
                    zero.next = temp;
                    zero = zero.next;
                }
            } else if (temp.val == 1) {
                if (one == null) {
                    one = temp;
                    oneHead = one;
                } else {
                    one.next = temp;
                    one = one.next;
                }
            } else {
                if (two == null) {
                    two = temp;
                    twoHead = two;
                } else {
                    two.next = temp;
                    two = two.next;
                }
            }
            temp = temp.next;
        }

        if (zeroHead != null && oneHead != null && twoHead != null) {
            zero.next = oneHead;
            one.next = twoHead;
            two.next = null;
            return zeroHead;
        } else if (zeroHead != null && oneHead != null && twoHead == null) {
            zero.next = oneHead;
            one.next = null;
            return zeroHead;
        } else if (zeroHead != null && oneHead == null && twoHead != null) {
            zero.next = twoHead;
            two.next = null;
            return zeroHead;
        } else if (zeroHead != null && oneHead == null && twoHead == null) {
            zero.next = null;
            return zeroHead;
        } else if (zeroHead == null && oneHead != null && twoHead != null) {
            one.next = twoHead;
            two.next = null;
            return oneHead;
        } else if (zeroHead == null && oneHead != null && twoHead == null) {
            one.next = null;
            return oneHead;
        } else {
            two.next = null;
            return twoHead;
        }
    }
}
