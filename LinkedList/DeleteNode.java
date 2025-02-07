class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while (true) {
            ListNode nextNode = temp.next;
            
            if(nextNode.next == null){
                temp.val = nextNode.val; 
                break;
            }
            temp.val = nextNode.val; 
            
        }
    }
}
