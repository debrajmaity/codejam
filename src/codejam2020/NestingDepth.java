package codejam2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NestingDepth {
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
    StringBuilder res = new StringBuilder();
    int count = -1;
    int currentCount = -1;
    int prevNumber = -1;
    for (int i = 0; i < num.length(); i++) {
      int currentNum = Character.getNumericValue(num.charAt(i));
      if (count == -1) {
        count = currentNum;
        currentCount = currentNum;
      }
      if (i == 0) {
        while (currentCount > 0) {
          res = res.append('(');
          currentCount--;
        }
        res.append(num.charAt(i));
      } else {
        // if current number is smaller than previous number
        if (currentNum == 0) {
          while (count > 0) {
            res = res.append(')');
            count--;
          }
          res.append(num.charAt(i));
        } else if (prevNumber >= currentNum) {
          currentCount = prevNumber - currentNum;
          count = count - currentCount;
          while (currentCount > 0) {
            res = res.append(')');
            currentCount--;
          }
          res.append(num.charAt(i));
        } else {
          currentCount = currentNum - prevNumber;
          count = count + currentCount;
          while (currentCount > 0) {
            res = res.append('(');
            currentCount--;
          }
          res.append(num.charAt(i));
        }
      }
      // currentCount = currentNum;
      prevNumber = currentNum;
    }
    while (count > 0) {
      res = res.append(')');
      count--;
    }
    return res.toString();
  }
}
