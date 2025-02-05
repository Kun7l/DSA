public class RemoveDuplicatesFromSortedDll {
    Node removeDuplicates(Node head) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                if (temp.prev == null) {
                    temp.next.prev = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return head;

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
}
