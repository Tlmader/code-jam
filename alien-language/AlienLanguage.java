import java.math.*;
import java.util.*;

public class AlienLanguage {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    String[] nums = input.nextLine().split(" ");
    int l = Integer.parseInt(nums[0]);
    int d = Integer.parseInt(nums[1]);
    int n = Integer.parseInt(nums[2]);
    String[] dictionary = new String[d];
    for (int i = 0; i < d; i++) {
      dictionary[i] = input.nextLine();
    }
    for (int i = 1; i <= n; i++) {
      testCase(i, l, dictionary);
    }
  }

  public static void testCase(int n, int l, String[] dictionary) {
    char[] chars = input.nextLine().toCharArray();
    String[] tokens = new String[l];
    boolean group = false;
    int i = 0;
    for (char c : chars) {
      if (c == '(') {
        group = true;
      } else if (c == ')') {
        group = false;
        i++;
      } else {
        if (tokens[i] == null) {
          tokens[i] = Character.toString(c);
        } else {
          tokens[i] += c;
        }
        if (!group) {
          i++;
        }
      }
    }
    int k = 0;
    for (String s : dictionary) {
      for (int j = 0; j < l; j++) {
        if (tokens[j].indexOf(s.charAt(j)) < 0) {
          break;
        } else if (j == l - 1) {
          k++;
        }
      }
    }
    printCase(n, k);
  }

  public static int parseIntFromLine() {
    return Integer.parseInt(input.nextLine());
  }

  public static void printCase(int num, Object result) {
    System.out.println("Case #" + num + ": " + result);
  }
}
