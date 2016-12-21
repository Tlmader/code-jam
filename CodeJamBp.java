import java.math.*;
import java.util.*;

public class CodeJamBp {

  private static Scanner input;
  private static boolean debug = true;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int x = parseIntFromLine();
    if (debug) {
      x = 4;
    }
    for (int i = 1; i <= x; i++) {
      testCase(i);
    }
  }

  public static void testCase(int x) {
    printCase(x, null);
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
