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
    int x = parseIntFromLine();
    for (int i = 1; i <= x; i++) {
      testCase(i);
    }
  }

  public static void testCase(int x) {
    int n = parseIntFromLine();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      String[] points = input.nextLine().split(" ");
      a[i] = Integer.parseInt(points[0]);
      b[i] = Integer.parseInt(points[1]);
    }
    int y = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if ((a[i] < a[j] && b[i] > b[j]) || (a[i] > a[j] && b[i] < b[j])) {
          y++;
        }
      }
    }
    printCase(x, y);
  }

  public static int parseIntFromLine() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }
}
