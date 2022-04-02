package codejam2020.round1c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        if (t > 100) t = 100;
        for (int i = 1; i <= t; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            String path = in.next();
            System.out.println("Case #" + i + ": " + getOutput(x, y, path));
        }
    }

    private static String getOutput(int x, int y, String path) {
      int i = 0;
      int time = 0;
      while(i<path.length()) {
          switch (path.charAt(i)) {
            case 'S':
                y = y - 1;
                break;
            case 'N':
                y = y + 1;
                break;
            case 'E':
                x = x + 1;
                break;
            case 'W':
                x = x - 1;
                break;
          }

          if ((Math.abs(x) + Math.abs(y)) <= (i+1)) {
              time = i+1;
              break;
          }

          i++;
      }

      if(time == 0) {
          return "IMPOSSIBLE";
      }
        return String.valueOf(time);
    }
}
