
public class DeletNodeInDLL {
    public Node deleteNode(Node head, int x) {
        if (head == null || head.next == null) {
            return null;
        }
        if (x==1) {
            head = head.next;
            head.prev = null;
            return head;
        }
        int count = 1;
        Node temp = head;
        while (count<x && temp!=null) {
            temp = temp.next;
            count++;
        }
        if(temp == null) return head;
        if(temp.next == null){
            temp.prev.next = null;
        }
        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        return head;
    }
}
