import java.util.*;

public class ReverseWords {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    for (int i = 1; i <= n; i++) {
      testCase(i);
    }
  }

  public static void testCase(int n) {
    List<String> words = Arrays.asList(input.nextLine().split(" "));
    Collections.reverse(words);
    System.out.print("Case #" + n + ": ");
    for (String w : words) {
      System.out.print(w + " ");
    }
    System.out.println();
  }
}
