package org.sb.devops.service;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = new int[] { 566, 1, 4, 85, 8, 9, 14 };
    for (int i = 0; i < arr.length; i++) {
      bubbleSort(arr, 0);
    }

    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr, int start) {
    if (arr[start] > arr[start + 1]) {
      int tmp = arr[start + 1];
      arr[start + 1] = arr[start];
      arr[start] = tmp;
    }
    if ((start + 1) < arr.length - 1) {
      bubbleSort(arr, start + 1);
    }
  }

}
