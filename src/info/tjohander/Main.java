package info.tjohander;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String fullText = "";

    try {
      FileReader reader = new FileReader(new File("/Users/lopan/sample-text.txt"));
      Scanner scanner = new Scanner(reader);
      while (scanner.hasNextLine()) {
        fullText = fullText + scanner.nextLine();
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }

    System.out.println(fullText);

  }

}
