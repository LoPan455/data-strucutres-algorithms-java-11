package info.tjohander.array;

import info.tjohander.util.Util;
import java.util.Arrays;

/**
 * This is the actual merge sort algorithm
 */
public class MergeSort2 {

  public static void main(String[] args) {
    int[] array1 = Util.randomIntNumberGenerator(18, 50);
    System.out.println(Arrays.toString(array1));
    sort(array1, array1[0], array1.length - 1);

  }

  public static void sort(int[] array, int leftIndex, int rightIndex) {
    System.out.println("Entering sort()...Value of 'array' is: " + Arrays.toString(array));

    // This will tell us if the array has been broken down into it's smallest possible element
    if (leftIndex < rightIndex) {

      // This will get us the middle index of the array
      int middle = (leftIndex + rightIndex) / 2;

      // now we go into the recursion by first calling this same method on itself using the left array
      sort(array, leftIndex, middle);
      sort(array, middle + 1, rightIndex);
    }
  }
}
