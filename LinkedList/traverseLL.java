public class traverseLL {
    public void printList(ListNode head){
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("Null");
        System.out.println();
    }
}
