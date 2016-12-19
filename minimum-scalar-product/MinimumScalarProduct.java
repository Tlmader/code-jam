import java.math.*;
import java.util.*;

/**
 * https://code.google.com/codejam/contest/32016/dashboard#s=p0
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-12-18
 */
public class MinimumScalarProduct {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int x = parseInt();
    for (int i = 1; i <= x; i++) {
      testCase(i);
    }
  }

  public static void testCase(int x) {
    int n = parseInt();
    String[] str1 = input.nextLine().split(" ");
    String[] str2 = input.nextLine().split(" ");
    Integer[] v1 = new Integer[n];
    Integer[] v2 = new Integer[n];
    for (int i = 0; i < n; i++) {
      v1[i] = Integer.parseInt(str1[i]);
      v2[i] = Integer.parseInt(str2[i]);
    }
    Arrays.sort(v1);
    Arrays.sort(v2, Collections.reverseOrder());
    BigInteger p = BigInteger.ZERO;
    for (int i = 0; i < n; i++) {
      BigInteger n1 = BigInteger.valueOf(v1[i]);
      BigInteger n2 = BigInteger.valueOf(v2[i]);
      p = p.add(n1.multiply(n2));
    }
    printCase(x, p.toString());
  }

  public static int parseInt() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int x, Object result) {
    System.out.println("Case #" + x + ": " + result);
  }
}
