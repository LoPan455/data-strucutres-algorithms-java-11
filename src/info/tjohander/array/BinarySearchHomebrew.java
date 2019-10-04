package info.tjohander.array;

import info.tjohander.util.Util;
import java.util.Arrays;

public class BinarySearchHomebrew {

  public static int counter = 0;

  public static void binarySearch(int[] array, int target) {
    counter++;
    int midPointIndex = ((array.length - 1) / 2);
    int[] newArray;
    if (target == array[midPointIndex - 1]) {
      System.out.println("Found! It took " + counter + " iterations to find number " + target);
      return;
    } else if (target < array[midPointIndex - 1]) {
      newArray = Arrays.copyOfRange(array, 0, midPointIndex);
    } else {
      newArray = Arrays.copyOfRange(array, midPointIndex + 1, array.length - 1);
    }
    binarySearch(newArray, target);
  }

  public static void main(String[] args) {
    int[] sortedNumbers = Util.orderedIntArray(1000);
    int target = (int) Math.floor(Math.random() * 1000);
    System.out.println("Searching for " + target + "...");
    binarySearch(sortedNumbers, target);
  }
}
