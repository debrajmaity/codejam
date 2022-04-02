package year2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GoOwnWay {
  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    if (t > 100) t = 100;

    for (int i = 1; i <= t; i++) {
      int size = in.nextInt();
      String path = in.next();
      System.out.println("Case #" + i + ": " + getOutput(size, path));
    }
  }

  private static String getOutput(int size, String path) {
    StringBuilder res = new StringBuilder();
    for (char c : path.toCharArray()) {
      res.append((c == 'S') ? 'E' : 'S');
    }

    return res.toString();
  }
}
