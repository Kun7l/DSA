public class RemoveNthNodefromEndOfLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int nthIndex = length - n + 1;
        length = 1;
        temp=head;
        ListNode prev = head;
        while (length != nthIndex) {
            prev = temp;
            temp = temp.next;
            length ++;
        }
        if(nthIndex == 1){
           return temp.next;
        }
        if(temp.next != null){
            prev.next = temp.next;
        }
        else{
            prev.next = null;
        }
        return head;
    }
}
