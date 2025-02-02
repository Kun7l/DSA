
public class Main {
    public static void main(String[] args) {
      LinkedList l = new LinkedList();
      int[] arr = {4,5,2,1,3,9,6,7};
      ListNode head = l.convertToLL(arr);
      sortLL s = new sortLL();
      head = s.sortList(head);
      traverseLL t = new traverseLL();
      t.printList(head);
    }
}
