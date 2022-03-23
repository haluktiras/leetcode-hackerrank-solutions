package leetcode;

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    String input = "ccc";
    System.out.println(longestPalindrome(input));
  }

  public static String longestPalindrome(String s) {

    String subString = "", longestPalindrome = s.substring(0, 1);

    for (int i = 0; i < s.length() - 1; i++) {
      for (int j = i + 2; j <= s.length(); j++) {
        subString = s.substring(i, j);
        if (isPalindrome(subString) && subString.length() > longestPalindrome.length()) {
          longestPalindrome = subString;
        }
      }
    }

    return longestPalindrome;
  }

  public static boolean isPalindrome(String text) {
    StringBuilder plain = new StringBuilder(text);
    StringBuilder reverse = plain.reverse();
    return (reverse.toString()).equals(text);
  }
}
