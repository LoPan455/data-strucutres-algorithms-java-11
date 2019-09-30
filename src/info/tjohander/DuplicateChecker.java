package info.tjohander;

import java.time.Duration;
import java.time.Instant;

public class DuplicateChecker {

  public static void main(String[] args) {
    int[] classGrades = Util.randomIntNumberGenerator(5000, 5000);
    Instant start = Instant.now();
    int iterations = 0;
    boolean dupeFound = false;
    for (int i = 0; i < classGrades.length; i++) {
      for (int j = 0; j < classGrades.length; j++) {
        if (i != j && classGrades[i] == classGrades[j]) {
          System.out.println("Dupe value: " + classGrades[i]);
          System.out.println("Coordinates: 'i': " + i + ", j: " + j);
          iterations++;
          dupeFound = true;
        }
      }
    }
    if (dupeFound) {
      System.out.println("Duplicate found");
    } else {
      System.out.println("No dupe found");
    }
    Instant end = Instant.now();
    long duration = Duration.between(start, end).toMillis();
    System.out.println("Processing time: " + duration + "ms");
    System.out.println("Iterations: " + iterations);
  }


}
