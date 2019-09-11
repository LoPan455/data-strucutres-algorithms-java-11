package info.tjohander;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class NaiveStringMatching {

  public static void main(String[] args) throws FileNotFoundException {

    Instant start = Instant.now();
    String text = "";
    FileReader reader = new FileReader(new File("/Users/lopan/sample-text.txt"));
    Scanner scanner = new Scanner(reader);
    while (scanner.hasNextLine()) {
      text = text + scanner.nextLine();
    }
    System.out.println("Length of Text is: " + text.length() + " characters");
    scanner.close();

    // Constants
    String pattern = "viverra";
    char[] arrayText = text.toCharArray();
    char[] arrayPattern = pattern.toCharArray();
    int lengthOfText = text.length();
    int lengthOfPattern = pattern.length();

    for (int i = 0; i < lengthOfText - lengthOfPattern; i++) {
      // count of matches
      int matchCount = 0;
      // inner loop
      for (int j = 0; j < lengthOfPattern; j++) {
        if (arrayPattern[j] != arrayText[i + j]) {
          // if there is no match between the current character of the text and the current char of the pattern, we don't need to keep looking
          break;
        }
        // Log a match of one character
        matchCount++;
      }
      // if the number of char matches is equal to the pattern we're looking for, we have found a match!
      if (matchCount == lengthOfPattern) {
        System.out.println(
            "Pattern found at " + (i + 1) + " position " + (i + 1) + "(shift = " + i + ")");
      }
    }
    Instant end = Instant.now();
    System.out.println("This algorithm took: " + Duration.between(start, end).toMillis() + " milliseconds");
  }
}
