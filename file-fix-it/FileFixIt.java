import java.math.*;
import java.util.*;

/**
 * https://code.google.com/codejam/contest/351101/dashboard#s=p1
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-12-20
 */
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
    String[] nums = input.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    Set<String> existing = new HashSet<>();
    for (int i = 0; i < n; i++) {
      String[] dir = input.nextLine().split("/");
      String str = "";
      for (int j = 1  ; j < dir.length; j++) {
        str += "/" + dir[j];
        existing.add(str);
      }
    }
    int oldSize = existing.size();
    for (int i = 0; i < m; i++) {
      String[] dir = input.nextLine().split("/");
      String str = "";
      for (int j = 1; j < dir.length; j++) {
        str += "/" + dir[j];
        existing.add(str);
      }
    }
    int y = existing.size() - oldSize;
    printCase(x, y);
  }

  public static int parseIntFromLine() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }
}
