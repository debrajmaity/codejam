package codejam2020;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatternMatch {
  public static void main(String args[]) {
    Scanner in = new Scanner(new InputStreamReader(new BufferedInputStream(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = in.nextInt();
      List<String> inputs = new ArrayList<>(n);
      String largestStr = "";
      String currStr = "";
      for (int j = 0; j < n; j++) {
        if (j == 0) {
          largestStr = in.next();
          currStr = largestStr;
        } else {
          currStr = in.next();
          if (currStr.length() > largestStr.length()) {
            largestStr = currStr;
          }
        }
        inputs.add(currStr.replace("*", ""));
      }
      System.out.println("Case #" + i + ": " + getOutput(inputs, largestStr));
    }
  }

  private static String getOutput(List<String> inputs, String largestStr) {
    // case 1
    String biggestP = largestStr.replace("*", "");
    boolean match = true;
    for (String p : inputs) {
      if (p.isEmpty() || p == "") {
        continue;
      }
      if (!biggestP.endsWith(p)) {
        match = false;
        break;
      }
    }

    if (match) {
      return biggestP;
    }

    return "*";
  }
}
