package LcPending;
import java.util.*;
/**
 * dailyProblem
 */
public class dailyProblem {

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++) {
                  arr[i] = scn.nextInt();
            }


            class Solution {
                  public int[] dailyTemperatures(int[] temp) {
                      int[] res = new int[temp.length];
                      for (int i = temp.length - 2; i >= 0; i--) {
                          int next = i + 1;
                          while (next < temp.length && temp[next] <= temp[i]) {
                              if (res[next] == 0) {
                                  next = temp.length;
                                  break;
                              }
                              next += res[next];
                          }
                          if (next < temp.length) res[i] = next - i;
                      }
                      return res;
                  }
              }
      }
}