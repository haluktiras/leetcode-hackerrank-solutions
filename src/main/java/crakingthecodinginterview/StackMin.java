package crakingthecodinginterview;

/*

* Question: How would you design a stack which, in addition to push and pop, has a function min
* which returns the minumum element? Push, pop and min should all operate in O(1) time
*
* */

import java.util.Stack;

public class StackMin {

  public static void main(String[] args) {
    StackWithMin stackWithMin = new StackWithMin();

    stackWithMin.push(3);
    System.out.println(stackWithMin.min());

    stackWithMin.push(5);
    System.out.println(stackWithMin.min());

    stackWithMin.push(1);
    System.out.println(stackWithMin.min());

    stackWithMin.push(7);
    System.out.println(stackWithMin.min());

    stackWithMin.pop();
    System.out.println(stackWithMin.min());

    stackWithMin.pop();
    System.out.println(stackWithMin.min());
  }

  public static class StackWithMin extends Stack<Integer>{

    Stack<Integer> s2;

    public StackWithMin() {
      s2 = new Stack<>();
    }

    public void push(int value){
      if (value <= min()){
        s2.push(value);
      }
      super.push(value);
    }

    public Integer pop(){
      int value = super.pop();
      if (value == min()){
        s2.pop();
      }
      return value;
    }

    private int min() {
      if (s2.isEmpty()){
        return Integer.MAX_VALUE;
      } else {
        return s2.peek();
      }
    }
  }

}
