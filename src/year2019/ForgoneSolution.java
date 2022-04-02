package year2019;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class ForgoneSolution {
  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    if (t > 100) t = 100;

    for (int i = 1; i <= t; i++) {
      String num = in.next();
      System.out.println("Case #" + i + ": " + getOutput(num));
    }
  }

  private static String getOutput(String num) {
    StringBuilder res1 = new StringBuilder();
    StringBuilder res2 = new StringBuilder();

    for (int i = num.length() - 1; i >= 0; i--) {
      int c = Character.getNumericValue(num.charAt(i));
      if (c == 4) {
        res1.append(c - 1);
        res2.append(1);
      } else {
        res1.append(c);
        res2.append(0);
      }
    }

    return removeZeros(res1.reverse()) + " " + removeZeros(res2.reverse());
  }

  private static String removeZeros(StringBuilder str) {
    int i = 0;
    while (str.charAt(i) == '0') i++;

    StringBuilder sb = new StringBuilder(str);

    sb.replace(0, i, "");

    return sb.toString();
  }
}
