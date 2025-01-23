class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SearchKeyInLinkedList {
    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        for (int i = 0; i < n; i++) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
