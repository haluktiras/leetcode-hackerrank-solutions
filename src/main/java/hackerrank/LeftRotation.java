package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

  public static void main(String[] args) {
    List<Integer> inputList = new ArrayList<>();
    inputList.add(1);
    inputList.add(2);
    inputList.add(3);
    inputList.add(4);
    inputList.add(5);
    inputList.add(6);
    inputList.add(7);

    System.out.println(rotLeft(inputList, 2));
  }

  public static List<Integer> rotLeft(List<Integer> a, int d) {
    List<Integer> left = a.subList(0, d);
    List<Integer> right = a.subList(d, a.size());
    right.addAll(left);
    return right;

  }
}
