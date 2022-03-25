package leetcode;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("{[()]}"));
    System.out.println(isValid("(]"));
    System.out.println(isValid("([)]"));
    System.out.println(isValid("]"));
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
        stack.push(s.charAt(i));
      } else {
        Character lastChar = stack.isEmpty() ? '?' : stack.peek();
        if(lastChar == '{' && s.charAt(i) == '}'){
          stack.pop();
        } else if (lastChar == '(' && s.charAt(i) == ')'){
          stack.pop();
        } else if (lastChar == '[' && s.charAt(i) == ']'){
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

}
