public class Demo {
  public static void main(String[] args) {
    StackLinkedList stack = new StackLinkedList();
    stack.push(10);
    stack.push(1);
    stack.push(2);
    stack.push(5);

    stack.displayStack();
    System.out.println();
    System.out.println();

    // int removedItem = stack.pop();
    // stack.displayStack();

    // System.out.println();
    // int pickedItem = stack.peek();
  }
}
