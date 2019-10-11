package info.tjohander.array;

import static info.tjohander.util.Util.*;

import info.tjohander.util.Util;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


/**
 * All this one does is merge two arrays and then call Arrays.sort() on the resulting merged array.
 */
public class MergeSort {

  public static void main(String[] args) {

    // int[] array1 = Util.randomIntNumberGenerator(8, 50);
    int[] array1 = {22, 26, 29, 35, 36, 38, 38, 41};
    Arrays.sort(array1);
    System.out.println("Array 1: " + Arrays.toString(array1));
    // int[] array2 = Util.randomIntNumberGenerator(5, 50);
    int[] array2 ={3, 17, 23, 31, 46};
    Arrays.sort(array2);
    System.out.println("Array 2: " + Arrays.toString(array2));
    int[] array3 = new int[array1.length + array2.length];

    int i = 0, j = 0, k = 0;

    Instant start = Instant.now();

    while (i < array1.length && j < array2.length) {

      // this part of the code isn't even necessary.  This exercise is just dumb.
//      if (array1[i] < array2[i]) {
//        array3[k++] = array1[i++];
//      } else {
//        array3[k++] = array2[j++];
//      }
      while (i < array1.length) {
        array3[k++] = array1[i++];
      }
      while (j < array2.length) {
        array3[k++] = array2[j++];
      }
    }


    Arrays.sort(array3);
    Instant end = Instant.now();
    System.out.println("Array 3: " + Arrays.toString(array3));
    System.out.println("Duration: " + Duration.between(start, end).toNanos());
    int[] sample = new int[]{3, 17, 22, 23, 26, 29, 31, 35, 36, 38, 38, 41, 46};
    if(Arrays.equals(array3, sample) ) {
      System.out.println("The arrays are the same");
    }
  }
}
