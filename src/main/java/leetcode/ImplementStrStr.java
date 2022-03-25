package leetcode;

public class ImplementStrStr {

  public static void main(String[] args) {

    String haystack = "abbbbbbbbbbbcde";
    String needle = "cde";
    System.out.println(strStr(haystack, needle));
  }

  public static int strStr(String haystack, String needle) {
    if ((haystack.length() == 0 && needle.length() == 0) || haystack.equals(needle)) return 0;
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }
    return -1;
  }

}
