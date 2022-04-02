package year2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Cryptopangrams {
  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    if (t > 100) t = 100;

    for (int i = 1; i <= t; i++) {
      String input = in.next();
      String crypto = in.next();
      System.out.println("Case #" + i + ": " + getOutput(input, crypto));
    }
  }

  private static String getOutput(String input, String crypto) {
    StringBuilder res = new StringBuilder();

    return res.toString();
  }

  private static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i < n; i++) if (n % i == 0) return false;

    return true;
  }

  private static ArrayList<Integer> getPrimeNumbers(int n) {
    ArrayList list = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) list.add(i);
    }

    return list;
  }
}
