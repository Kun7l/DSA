
public class InsertNodeInDLL {
    
    Node addNode(Node head, int p, int x) {
        if (head == null) {
            return new Node(x);
        }
        int counter = 0;
        Node temp = head;
        while (counter < p && temp.next !=null) {
            temp = temp.next;
            counter++;
        }

        // for last position
        if(temp.next == null){
            Node newNode = new Node(x);
            temp.next = newNode;
            newNode.prev = temp;
        }
        else{
            Node newNode = new Node(x);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
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


