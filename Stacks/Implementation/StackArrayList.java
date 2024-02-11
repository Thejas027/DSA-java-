import java.util.*;

public class StackArrayList {

  static class Customstack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
      return list.size() == 0;
    }

    public static void push(int value) {
      list.add(value);
    }

    public static int pop() {
      if (isEmpty()) {
        throw new IllegalStateException("Styack is Empty !");
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    public static int peek() {
      if (isEmpty()) {
        throw new IllegalStateException("Stack is empty !");
      }
      return list.get(list.size() - 1);
    }
  }

  @SuppressWarnings(value = "static-access")
  public static void main(String[] args) {
    Customstack stack = new Customstack();
    Scanner sc = new Scanner(System.in);
    int value, choice;
    do {
      System.out.println("\nMENU\n");
      System.out.println("1.To Push the element to stack");
      System.out.println("2.To Pop the element from the stack");
      System.out.println("3.To Peek the top most element from the stack");
      System.out.println("4.To display the stack elements");
      System.out.println("5.To exit the program");
      System.out.println("Enter your choice");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter the value to push into stack");
          value = sc.nextInt();
          stack.push(value);
          break;

        case 2:
          System.out.println("The popped element from stack : " + stack.pop());
          break;

        case 3:
          System.out.println("The top most element in stack : " + stack.peek());
          break;
        case 4:
          System.out.println("Stack elements : " + stack.list);
          break;
        case 5:
          System.out.println("Exiting the program..");
          return;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 5);
    sc.close();
  }
}