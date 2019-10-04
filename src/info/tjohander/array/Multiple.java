package info.tjohander.array;

import java.util.Arrays;

/**
 * This class will demo working with two-dimensional arrays
 */
public class Multiple {

  public static void main(String[] args) {
    int[][] multiArray = { {1001, 56, 78, 43}, {1002, 45, 98, 34}, {1003, 56, 89, 34} };
    for (int i = 0; i < multiArray.length; i++) {
      System.out.println(
          "Student " + multiArray[i][0] + "'s grades are : " + multiArray[i][1] + ", "
              + multiArray[i][2] + ", " + multiArray[i][3]);
    }
  }
}
