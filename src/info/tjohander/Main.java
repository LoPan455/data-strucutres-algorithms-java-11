package info.tjohander;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String fullText = "";

    try {
      FileReader reader = new FileReader(new File("/Users/lopan/long-sample-text.txt"));
      Instant start = Instant.now();
      Scanner scanner = new Scanner(reader);
      while (scanner.hasNextLine()) {
        fullText = fullText + scanner.nextLine();
      }
      Instant end = Instant.now();
      System.out.println("Duration was: " + Duration.between(start, end).toMillis() + " milliseconds");
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
    System.out.println(fullText);

  }

}
