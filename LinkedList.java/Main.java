
public class Main {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    int[] arr = { 9,9,9,9,9,9,9 };
    int[] arr2 = { 9,9,9,9};
    ListNode head = l.convertToLL(arr);
    ListNode head2 = l.convertToLL(arr2);
    AddTwoNumbersUsingLL a = new AddTwoNumbersUsingLL();
    ListNode newHead = a.addTwoNumbers(head, head2);
    traverseLL t = new traverseLL();
    t.printList(newHead);
    // System.out.println(9 / 10);
  }

}
