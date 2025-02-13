public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1 == null && list2 == null)
            return null;

        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val || temp2 == null) {
                ListNode dummyNode = new ListNode(temp1.val);
                temp.next = dummyNode;
                temp = temp.next;
                temp1 = temp1.next;
            } else {
                ListNode dummyNode = new ListNode(temp2.val);
                temp.next = dummyNode;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null) {
            temp.next = temp1;
        }
        if (temp2 != null) {
            temp.next = temp2;
        }

        return newHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
