public class DeleteAllOccurancesOfKeyinDLL {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
                if(temp.prev == null){
                    temp.next.prev = null;
                    head = temp.next;
                }
                else if (temp.next == null) {
                    temp.prev.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}