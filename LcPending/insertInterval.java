package LcPending;
import java.util.*;
public class insertInterval {

      // krna hai yeah question 56
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[][] intervals = new int[n][2];
            int[][] newintervals = new int[1][2];
            for(int i = 0; i < n; i++) {
                  intervals[i][0] = scn.nextInt();
                  intervals[i][1] = scn.nextInt();
            }

            newintervals[0][0] = scn.nextInt();
            newintervals[0][1] = scn.nextInt();

            int[][] ans = insert(intervals, newintervals);
            for(int i = 0; i < n; i++) {

            }

      }
      public static int[][] insert(int[][] intervals, int[][] newintervals){
            int[][] arrr = new int[0][0];
            return arrr;
      }

      
}
