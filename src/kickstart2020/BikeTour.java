package kickstart2020;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BikeTour {
    public static void main(String args[]) {
        Scanner in = new Scanner(new InputStreamReader(new BufferedInputStream(System.in)));
        while (in.hasNext()) {
            int t = in.nextInt();
            for (int i=1; i<=t ; i++) {
                int n = in.nextInt();
                int numOfPeaks = 0;
                int curr = -1;
                int prev = -1;
                int next = -1;
                for (int j=0;j<n;j++) {
                    if(j==0) {
                        prev = in.nextInt();
                        //continue;
                    } else if (j+1==n) {
                        next = in.nextInt();
                        if((curr>prev)&&(curr>next)) {
                            numOfPeaks++;
                        }
                        //continue;
                    } else if (j == 1) {
                        curr = in.nextInt();
                        //continue;
                    } else {
                        next = in.nextInt();
                        if (curr > prev && curr > next) {
                          numOfPeaks++;
                        }
                        prev = curr;
                        curr = next;
                    }
                }
                System.out.println("Case #" + i + ": " + numOfPeaks);
            }
        }
    }
}
