// PUSH AT THE BOTTOM OF STACK

import java.util.*;

public class Ques1 {

  public static void pushAtBottom(Stack<Integer> s, int value) {
    if (s.isEmpty()) {
      s.push(value);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, value);
    s.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(s, 4);

    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }

  }

}