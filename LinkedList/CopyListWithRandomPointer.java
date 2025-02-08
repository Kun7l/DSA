import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            Node dummyNode = new Node(temp.val);
            map.put(temp, dummyNode);
            temp = temp.next;
        }
        System.out.println(map);
        temp = head;
        Node newHead = new Node(-1);
        Node newTemp = newHead;
        while (temp != null) {
            Node next = map.get(temp.next);
            Node random = map.get(temp.random);
            Node current = map.get(temp);

            current.next = next;
            current.random = random;
            newTemp.next = current;
            newTemp = newTemp.next;
            temp = temp.next;
        }
        return newHead.next;
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
