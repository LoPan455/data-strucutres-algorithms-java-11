package info.tjohander.array;

import info.tjohander.util.Util;
import java.util.Arrays;

public class Array {

  public static void main(String[] args) {
    int[] array = Util.randomIntNumberGenerator(350, 100);
    int middle = array.length / 2;
    int anotherMiddle = (array.length - 1) / 2;
    System.out.println(Arrays.toString(array));
    System.out.println("Middle: " + middle);
    System.out.println("Middle 2: " + anotherMiddle);
  }

}
