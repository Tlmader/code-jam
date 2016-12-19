import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

/**
 * https://code.google.com/codejam/contest/351101/dashboard#s=p0
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-12-17
 */
public class StoreCredit {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int n = parseInt();
    for (int i = 1; i <= n; i++) {
      testCase(i);
    }
  }

  public static void testCase(int n) {
    int credit = parseInt();
    int items = parseInt();
    String[] str = input.nextLine().split(" ");
    int[] prices = new int[items];
    for (int i = 0; i < items; i++) {
      prices[i] = Integer.parseInt(str[i]);
    }
    System.out.println("Case #" + n + ": " + findItems(credit, prices));
  }

  public static String findItems(int credit, int[] prices) {
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] + prices[j] == credit) {
          return (i + 1) + " " + (j + 1);
        }
      }
    }
    return null;
  }

  public static int parseInt() {
    return Integer.parseInt(input.nextLine());
  }
}
