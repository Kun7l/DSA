
public class Main {
  public static void main(String[] args) {
   LinkedList l = new LinkedList();
   int[] arr = {1,2,3,4,5};
   ListNode head = l.convertToLL(arr);
   RotateLL r = new RotateLL();
   head = r.rotateRight(head, 0);
   traverseLL t = new traverseLL();
   t.printList(head);
    
  }

}
