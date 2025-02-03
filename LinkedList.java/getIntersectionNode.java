public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            int data = tempA.val;
            tempB = headB;
            while (tempB != null) {
                if (tempB == tempA) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }

        return null;
    }
}
