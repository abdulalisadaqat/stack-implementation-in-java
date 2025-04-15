public class StackLinkedList {
  private StackNode top;

  public StackLinkedList() {
    top = null;
  }

  // insert new node to top of the list
  public void push(int data) {
    StackNode newNode = new StackNode(data);
    newNode.prev = top;
    top = newNode;
  }

  // remove the top node of the list
  public int pop() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      StackNode temp = top;
      top = top.prev;
      System.out.println("key " + temp.data + " was deleted");
      return temp.data;
    }
  }

  // pick the top node of the list
  public int peek() {
    if (top == null) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      System.out.println("top key is " + top.data);
      return top.data;
    }
  }

  // print the whole list
  public void displayStack() {
    if (top == null) {
      System.out.println("Stack is empty");
      return;
    }
    StackNode temp = top;
    while (temp != null) {
      System.out.print(temp.data + ", ");
      temp = temp.prev;
    }
  }
}