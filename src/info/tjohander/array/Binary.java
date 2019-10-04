package info.tjohander.array;

import info.tjohander.util.Util;

public class Binary {

  public static void main(String[] args) {
    int[] sortedNumbers = Util.orderedIntArray(1000);
    int target = (int) Math.floor(Math.random() * 1000);
    System.out.println("Searching for " + target + "...");
    int lowest = 0;
    int highest = sortedNumbers.length - 1;
    int middleIndex = sortedNumbers.length / 2;

    while (lowest <= highest) {
      if (target < sortedNumbers[middleIndex]) {
        highest = middleIndex - 1;
      } else if (target == sortedNumbers[middleIndex]) {
        System.out.println("Found " + target +" at index " + middleIndex);
        break;
      } else {
        lowest = middleIndex + 1;
      }
      middleIndex = (highest + lowest) / 2;
    }
  }
}
