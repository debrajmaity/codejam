package codejam2020.round1c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem2 {
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
        return "";
    }
}
