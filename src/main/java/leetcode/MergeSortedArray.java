package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] nums2 = new int[]{2, 5, 6};
    merge(nums1, 3, nums2, 3);
    Arrays.stream(nums1).boxed().forEach(System.out::println);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = 0;
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[index++];
    }
    Arrays.sort(nums1);
  }
}
