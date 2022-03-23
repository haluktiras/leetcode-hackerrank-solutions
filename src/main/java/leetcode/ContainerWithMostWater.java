package leetcode;

public class ContainerWithMostWater {

  public static void main(String[] args) {
    int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(maxArea(input));
  }

  public static int maxArea(int[] height) {
    int maxArea = Integer.MIN_VALUE;
    int i = 0;
    int j = height.length - 1;
    while (i < j) {
      int min = Math.min(height[i], height[j]);
      maxArea = Math.max(maxArea, min * (j - i));
      if (height[i] < height[j]){
        i++;
      }else {
        j--;
      }
    }
    return maxArea;
  }

  // complexity is O(n^2)
  public static int maxAreaTimeLimitExceeded(int[] height) {
    int maxArea = 0, area;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        area = Integer.min(height[i], height[j]) * (j - i);
        if (area > maxArea) {
          maxArea = area;
        }
      }
    }
    return maxArea;
  }

}
