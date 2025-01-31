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
}
