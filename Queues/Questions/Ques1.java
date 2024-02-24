import java.util.LinkedList;
import java.util.Queue;

// First non reapeating letter in a stream of a character

public class Ques1 {

  public static void printNonReaptingCh(String str) {
    int freq[] = new int[26]; // to keep the track of the character how many times it is reapeating
    Queue<Character> q = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);

      freq[ch - 'a']++;

      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
        q.remove(); // removes the character from queue if the frequency of front character is more
                    // than 1
      }

      if (q.isEmpty()) {
        System.out.println(-1 + " "); // prints -1 if no element found or if any non reapting character if not found
      } else {
        System.out.println(q.peek()); // if queue not found then the front character will be the 1st non reapting
                                      // number so it gets printed
      }

    }
    System.out.println();
  }

  public static void main(String[] args) {
    String str = "aabccxb";
    printNonReaptingCh(str);
  }
}
