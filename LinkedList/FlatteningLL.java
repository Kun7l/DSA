public class FlatteningLL {
    Node flatten(Node root) {
        if (root.next == null || root == null)
            return root;
        Node down = root.bottom;
        Node right = root.next;
        Node temp = right;
        Node prev = root;

        while (temp != null || right != null) {
            Node dummy = new Node(temp.data);
            if (down == null) {
                prev.bottom = dummy;
                dummy.bottom = down;
            } else {
                while (temp.data > down.data) {
                    prev = down;
                    down = down.bottom;
                    if (down == null) {
                        break;
                    }
                }
                prev.bottom = dummy;
                dummy.bottom = down;
            }

            down = root.bottom;
            prev = root;

            temp = temp.bottom;
            if (temp == null) {
                right = right.next;
                temp = right;
            }
        }
        return root;
    }

    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int val) {
            this.data = val;
            this.next = null;
            this.bottom = null;
        }
    }

}
