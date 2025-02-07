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

    Node optimal(Node root) {
        if (root == null || root.next == null) {
           return root;
        }
        Node mergedHead = optimal(root.next);
        return mergeTwo(root, mergedHead);
    }

    Node mergeTwo(Node l1, Node l2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                Node newNode = new Node(l2.data);
                temp.bottom = newNode;
                l2 = l2.bottom;
            } else {
                Node newNode = new Node(l1.data);
                temp.bottom = newNode;
                l1 = l1.bottom;
            }
            temp = temp.bottom;
        }

        if (l1 != null) {
            while (l1 != null) {
                Node newNode = new Node(l1.data);
                temp.bottom = newNode;
                l1 = l1.bottom;
                temp = temp.bottom;
            }
        } else if (l2 != null) {
            while (l2 != null) {
                Node newNode = new Node(l2.data);
                temp.bottom = newNode;
                l2 = l2.bottom;
                temp = temp.bottom;
            }
        }

        return dummyNode.bottom;
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
