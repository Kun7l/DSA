public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = getDifference(headA, headB);

        if (diff < 0) {
            while (diff != 0) {
                headB = headB.next;
                diff++;
            }
        } else {
            while (diff != 0) {
                headA = headA.next;
                diff--;
            }
        }

        while (headA!=null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int getDifference(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;

        while (headA != null) {
            lenA++;
            headA = headA.next;
        }
        while (headB != null) {
            lenB++;
            headB = headB.next;
        }

        return lenA - lenB;
    }
}
