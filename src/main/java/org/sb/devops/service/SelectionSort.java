package org.sb.devops.service;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    System.out.println("selection sort");

    // principle : starting from first element, find the smallest in residue, if found swap with first
    // ... continue to go to second element, and find smallest from the rest to
    // swap it with the second

    int[] sample = new int[] { 566, 1, 4, 85, 8, 9, 14 };

    for (int i = 0; i < sample.length - 1; i++) {

      // smallest = find smallest between i + 1 to sample.lenght < 1
      // if (smallest < sample[i]) swap between sample[i] and smallest else do nothing

      for (int j = i + 1; j < sample.length - 1; j++) {
        if (sample[j] > sample[j + 1]) {
          int smallest = sample[j + 1];
          sample[j + 1] = sample[j];
          sample[j] = smallest;
        }
      }

      if (sample[i] > sample[i + 1]) {
        int swap = sample[i + 1];
        sample[i + 1] = sample[i];
        sample[i] = swap;

      }

    }

    System.out.println(Arrays.toString(sample));
  }

}
