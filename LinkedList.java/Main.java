
public class Main {
    public static void main(String[] args) {
      LinkedList l = new LinkedList();
      int[] arr = {1,1};
      ListNode head = l.convertToLL(arr);
      Segregate012 s = new Segregate012();
      head = s.segregate(head);
      traverseLL t = new traverseLL();
      t.printList(head);
    }
}
