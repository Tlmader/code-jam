import java.math.*;
import java.util.*;

public class CodeJamBp {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int x = parseInt();
    for (int i = 1; i <= x; i++) {
      testCase(i);
    }
  }

  public static void testCase(int x) {
    printCase(x, null);
  }

  public static int parseInt() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }
}
