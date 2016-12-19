import java.math.*;
import java.util.*;

public class FileFixIt {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int x = parseIntFromLine();
    for (int i = 1; i <= x; i++) {
      testCase(i);
    }
  }

  public static void testCase(int x) {
    int n = parseIntFromLine();
    int m = parseIntFromLine();
    List<List<String>> dirs = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
    }
    printCase(x, null);
  }

  public static int parseIntFromLine() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }
}
