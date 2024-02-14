// Question to find the next greater element of an array on comparing
/*
 *  the next greater element of some element X in an array is the first greater  element that is to the right of X  in the same array
 * BRUTE FORCE METHOD : using NESTED LOOP (travesing the array and checking for thr greater element)  TIME COMPLEXCITY  == O(n^2);
 * so to reduce the time complexcity stacks are used <where stack is used to store or to keep the tarck of a index of an array since the its easier to track the stack elements)   time complexcity reduces to O(n)
 */

import java.util.*;;

public class Ques5 {
  public static void main(String[] args) {
    int arr[] = { 6, 8, 0, 1, 3 };
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nextGreater[i] = -1;
      } else {
        nextGreater[i] = arr[s.peek()];
      }
      s.push(i);
    }
    for (int i = 0; i < nextGreater.length; i++) {
      System.out.println(nextGreater[i] + " ");
    }
    System.out.println();
  }
}
