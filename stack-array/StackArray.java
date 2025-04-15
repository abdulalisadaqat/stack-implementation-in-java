public class StackArray {
  private int top;
  private int maxSize;
  private int[] array;

  public StackArray(int size) {
    this.top = -1;
    this.maxSize = size;
    this.array = new int[maxSize];
  }

  public void push(int data) {
    if (top >= maxSize - 1) {
      System.out.println("Stack Overflow! max size is " + maxSize);
      return;
    }
    array[++top] = data;
  }

  public void pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    array[top--] = 0;
  }

  public void peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.printf("\nTop element is: %d\n", array[top]);
  }

  public void displayStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(array[i] + ", ");
    }
  }
}