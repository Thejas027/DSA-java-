import java.util.*;

public class Ques3 {

  public static void pushAtBottom(Stack<Integer> s, int value) {
    if (s.isEmpty()) {
      s.push(value);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, value);
    s.push(top);
  }

  public static void reverse(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int top = s.pop();
    reverse(s);
    pushAtBottom(s, top);
  }

  public static void printStack(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.print(s.pop() + " ");
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    reverse(s);
    
    System.out.print("stack elements after reversed : ");
    printStack(s);
  }
}
