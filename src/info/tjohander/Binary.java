package info.tjohander;

public class Binary {

  public static void main(String[] args) {
    int[] sortedNumbers = Util.orderedIntArray(1000);
    int target = (int) Math.floor(Math.random() * 1000);
    System.out.println("Searching for " + target + "...");
    int lowest = 0;
    int highest = sortedNumbers.length - 1;
    int middle = (sortedNumbers.length - 1) / 2;
    while (lowest <= highest) {
      if (lowest <= middle) {
        if (sortedNumbers[middle] < target) {
          lowest = middle + 1;
        } else if (sortedNumbers[middle] == target) {
          System.out.println("Number found at index " + middle);
          break;
        } else {
          highest = middle - 1;
        }
        middle = (lowest + highest) / 2;
      }
      if (lowest > highest) {
        System.out.println("Number not found.");
      }
    }
  }
}
