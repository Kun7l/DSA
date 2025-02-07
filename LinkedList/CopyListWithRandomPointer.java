import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = null;
        while (temp != null) {
            map.put(temp, temp.random);
        }
    }
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
