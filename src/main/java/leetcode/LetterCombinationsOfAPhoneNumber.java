package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

  public static void main(String[] args) {
    System.out.println(letterCombinations("278"));
  }

  public static List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    while(ans.peek().length()!=digits.length()){
      String remove = ans.remove();
      String map = mapping[digits.charAt(remove.length())-'0'];
      for(char c: map.toCharArray()){
        ans.addLast(remove+c);
      }
    }
    return ans;
  }
}
