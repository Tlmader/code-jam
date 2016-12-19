import java.math.*;
import java.util.*;

/**
 * https://code.google.com/codejam/contest/619102/dashboard#s=p0
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-12-19
 */
public class RopeIntranet {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int t = parseInt();
    for (int i = 1; i <= t; i++) {
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
