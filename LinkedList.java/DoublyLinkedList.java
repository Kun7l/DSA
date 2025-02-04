
public class DoublyLinkedList {
    public Node ConstructDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node moverback = head;
      
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.prev = moverback;
            moverback.next = temp;
            moverback = temp;
        }
        return head;
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next,Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
