public class FIndLengthOfLoopInLL {
    public int countNodesinLoop(Node head) {
        int distance = 0;
        Node fast = head;
        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
            if (fast==head) {
                Node temp = head.next;
                while (temp!=head) {
                    distance++;
                    temp = temp.next;
                }
                return distance;
            }
        }
        return distance;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}