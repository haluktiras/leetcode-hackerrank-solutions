package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinimumBribes {

  public static void main(String[] args) {
    List<Integer> inputList = new ArrayList<>();
    inputList.add(2);
    inputList.add(1);
    inputList.add(5);
    inputList.add(3);
    inputList.add(4);

    minimumBribes(inputList);
  }

  public static void minimumBribes(List<Integer> q) {
    int bribe = 0;
    boolean chaotic = false;
    for (int i = 0; i < q.size() - 1; i++) {
      if (q.get(i) - (i + 1) > 2) {
        chaotic = true;
      }
      for (int j = q.get(i) - 1; j < i; j++) {
        if (q.get(j) > q.get(i)) {
          bribe++;
        }

      }
    }
    if (chaotic) {
      System.out.println("Too Chaotic");
    } else {
      System.out.println(bribe);
    }
  }
}
