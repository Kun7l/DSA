public class Add1inLL {
    public ListNode addOne(ListNode head) {
        int carry = AddwithCarry(head);

        if (carry>0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public int AddwithCarry(ListNode head) {
        if (head == null) {
            return 1;
        }

        int res = head.val + AddwithCarry(head.next);
        head.val = res % 10;

        return res / 10;
    }
}
