package leetcode;

public class ReverseInteger {

  public static void main(String[] args) {
    int input = -9000000;
    System.out.println(reverse(input));
  }

  public static int reverse(int x) {
    String reversed = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
    int positiveReversed = Integer.parseInt(reversed);
    return (x < 0) ? positiveReversed * -1 : positiveReversed;
  }
}
