import java.math.*;
import java.util.*;

/**
 * https://code.google.com/codejam/contest/544101/dashboard#s=p0
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-12-21
 */
public class Rotate {

  private static Scanner input;
  private static boolean debug = false;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int t = parseIntFromLine();
    for (int i = 1; i <= t; i++) {
      testCase(i);
    }
  }

  public static void testCase(int t) {
    String[] nums = input.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int k = Integer.parseInt(nums[1]);
    List<List<Character>> board = new ArrayList<>();
    for (int i = n; i > 0; i--) {
      char[] cArray = input.nextLine().toCharArray();
      board.add(0, new ArrayList<Character>());
      for (char c : cArray) {
        if (c != '.') {
          board.get(0).add(0, c);
        }
      }
      while (board.get(0).size() < n) {
        board.get(0).add('.');
      }
    }
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < n; j++) {
        logNoBreak(board.get(j).get(i).toString());
      }
      log("");
    }
    boolean red = false;
    boolean blue = false;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        char c = board.get(i).get(j);
        if (c != '.' && !(c == 'R' && red) && !(c == 'B' && blue) && !(red && blue)) {
          for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
              if (!(x == 0 && y == 0) && isJoin(board, k, i, j, x, y)) {
                if (c == 'R') {
                  red = true;
                } else if (c == 'B') {
                  blue = true;
                }
              }
            }
          }
        }
      }
    }
    String result = "Neither";
    if (red && blue) {
      result = "Both";
    } else if (red) {
      result = "Red";
    } else if (blue) {
      result = "Blue";
    }
    printCase(t, result);
  }

  public static boolean isJoin(List<List<Character>> board, int k, int i, int j, int x, int y) {
    if (k == 1) {
      log("true");
      return true;
    }
    if (i + x < 0 || i + x >= board.size() ||
        j + y < 0 || j + y >= board.size()) {
      log("false");
      return false;
    }
    log(i + "," + j + ": " + board.get(i).get(j) + " ? " + board.get(i + x).get(j + y));
    if (board.get(i).get(j) == board.get(i + x).get(j + y)) {
      return isJoin(board, k - 1, i + x, j + y, x, y);
    }
    log("false");
    return false;
  }

  public static int parseIntFromLine() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }

  public static void log(String message) {
    if (debug) {
      System.out.println(message);
    }
  }

  public static void logNoBreak(String message) {
    if (debug) {
      System.out.print(message);
    }
  }
}
