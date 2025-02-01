import java.util.ArrayList;

public class PalindromLL {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> stack = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            stack.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.val != stack.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public boolean optimalSol(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseList(slow.next);
        ListNode fist = head;
        ListNode second = newHead;

        while (second != null) {
            if (fist.val != second.val) {
                reverseList(newHead);
                return false;
            }
            fist = fist.next;
            second = second.next;
        }
        reverseList(newHead);
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
}
