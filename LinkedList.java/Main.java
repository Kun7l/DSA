
public class Main {
  public static void main(String[] args) {
    DoublyLinkedList l = new DoublyLinkedList();
    int[] arr = { 1, 2, 3, 4 };
    Node head = l.ConstructDLL(arr);

    FindPairsOfGivenSuminDLL f = new FindPairsOfGivenSuminDLL();
    System.out.println(f.findPairsWithGivenSum(5, head));
  }

}
