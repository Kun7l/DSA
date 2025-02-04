public class AddTwoNumbersUsingLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = (l1.val + l2.val + carry);
            ListNode dumNode = new ListNode(sum%10);
            carry = (sum) / 10;
            temp.next = dumNode;
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            while (l1!=null) {
            int sum = (l1.val + carry);
            ListNode dumNode = new ListNode(sum%10);
            carry = (sum) / 10;
            temp.next = dumNode;
            temp = temp.next;

            l1 = l1.next;
            }
        }
        else if (l2 != null) {
            while (l2 != null) {
            int sum = (l2.val + carry);
            ListNode dumNode = new ListNode(sum%10);
            carry = (sum) / 10;
            temp.next = dumNode;
            temp = temp.next;

            l2 = l2.next;
            }
        }

        if (carry>0) {
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }
        
        return ans.next;
    }
    public ListNode optimal(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2!=null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            ListNode dumNode = new ListNode(sum%10);
            carry = (sum) / 10;
            temp.next = dumNode;
            temp = temp.next;

        }
        return ans.next;
    }
}
