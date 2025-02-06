
public class Main {
  public static void main(String[] args) {
   LinkedList l = new LinkedList();
   int[] arr = {1,2};
   ListNode head = l.convertToLL(arr);
   ReverseNodesInKGroup r = new ReverseNodesInKGroup();
   head = r.reverseKGroup(head, 2);
   traverseLL t = new traverseLL();
   t.printList(head);
    
  }

}
