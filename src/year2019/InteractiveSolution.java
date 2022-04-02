package year2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InteractiveSolution {
  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    if (t > 100) t = 100;

    for (int i = 1; i <= t; i++) {
      String inputs = in.next();
      getOutput(inputs);
    }
  }

  private static void getOutput(String inputs) {
    String[] inputStr = inputs.split(",");
    int n = Character.getNumericValue(inputStr[0].charAt(0));
    int b = Character.getNumericValue(inputStr[1].charAt(0));
    int f = Character.getNumericValue(inputStr[2].charAt(0));
    System.out.println();
  }
}
