import java.util.*;

public class ReverseWords {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    for (int i = 1; i <= n; i++) {
      testCase(i);
    }
  }

  public static void testCase(int n) {
    List<String> words = Arrays.asList(input.nextLine().split(" "));
    Collections.reverse(words);
    System.out.print("Case #" + n + ": ");
    words.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
