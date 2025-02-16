package Recursion;
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode dummyNode = new ListNode(-1);
        ListNode newhead = dummyNode;

        while (list1 != null && list2 != null) {
            ListNode temp = null;
            if (list1.val < list2.val) {
                temp = list1;
                list1 = list1.next;
            } else {
                temp = list2;
                list2 = list2.next;
            }
            temp.next = null;
            dummyNode.next = temp;
            dummyNode = dummyNode.next;
        }
        if (list1 != null) {
            dummyNode.next = list1;
        }
        if (list2 != null) {
            dummyNode.next = list2;
        }

        return newhead.next;
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
