package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  private static final Map<Character, Integer> roman = new HashMap<>() {{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
  }};

  public static void main(String[] args) {
    System.out.println(romanToInt("XIV"));
  }

  public static int romanToInt(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i != s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
        sum += (roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i)));
        i++;
      } else {
        sum += roman.get(s.charAt(i));
      }
    }
    return sum;
  }
}
