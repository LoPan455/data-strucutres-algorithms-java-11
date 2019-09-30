package info.tjohander;

import static java.lang.Integer.toBinaryString;

public final class Util {
  /**
   * Generate an int[] of <quantity> numbers, between 0 and <max>
   * @param quantity
   * @param max
   * @return
   */
  public static int[] randomIntNumberGenerator(int quantity, int max) {
    // To make a whole number, so we need to multiply the random number by some amount to make it greater than zero.
    int multiplier = (int) Math.pow(10, Integer.toString(max).length());
    int[] result = new int[quantity];
    for (int i = 0; i < quantity - 1 ; i++) {
      result[i] = (int) Math.floor(Math.random() * multiplier);
    }
    return result;
  }


  public static double[] randomDoubleNumberGenerator(int quantity, double max) {
    // To make a whole number, so we need to multiply the random number by some amount to make it greater than zero.
    double multiplier = Math.pow(10, Double.toString(max).length() - 2);
    double[] result = new double[quantity];
    for (int i = 0; i < quantity - 1 ; i++) {
      result[i] = Math.floor(Math.random() * multiplier);
    }
    return result;
  }

  public static int[] orderedIntArray(int size) {
    int[] result = new int[size];
    for (int i = 0; i < size ; i++) {
      result[i] = i + 1;
    }
    return result;
  }

  private Util() {}
}
