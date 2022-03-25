package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

  public static void main(String[] args) {
    generateParenthesis(3).forEach(System.out::println);
  }

  public static List<String> generateParenthesis(int n) {
    List<String> outputList = new ArrayList();
    backTrack(outputList, n, "", 0, 0);
    return outputList;
  }

  public static void backTrack(List<String> outputList, int max, String current, int open, int close){
    if(current.length() == max * 2){
      outputList.add(current);
      return;
    }
    if (open < max){
      backTrack(outputList, max, current + '(', open+1, close);
    }
    if (close < open){
      backTrack(outputList, max, current + ')', open, close+1);
    }
  }
}
