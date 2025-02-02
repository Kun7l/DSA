public class sortLL {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = FindMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null; // Break the list
        ListNode leftHead = head;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead, rightHead);
    }

    public ListNode merge(ListNode leftList, ListNode rightList) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (leftList != null && rightList != null) {
            if (leftList.val <= rightList.val) {
                temp.next = leftList;
                leftList = leftList.next;
            } else {
                temp.next = rightList;
                rightList = rightList.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (leftList != null) {
            temp.next = leftList;
        }
        if (rightList != null) {
            temp.next = rightList;
        }

        return dummyNode.next;
    }

    public ListNode FindMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // This ensures correct middle in even-length lists
    }
}
