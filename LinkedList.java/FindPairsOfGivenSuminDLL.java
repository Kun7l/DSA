import java.util.ArrayList;
import java.util.Arrays;

public class FindPairsOfGivenSuminDLL {
    public ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node front = head;
        Node back = head;
        while (back.next != null) {
            back = back.next;
        }

        while (front != back) {
            if ((front.data + back.data)>target) {
                back = back.prev;
            }
            else if ((front.data + back.data)<target) {
                front = front.next;
            }
            else{
                ans.add(new ArrayList<>(Arrays.asList(front.data,back.data)));
                front = front.next;
            }
        }

        return ans;
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