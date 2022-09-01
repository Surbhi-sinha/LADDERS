// problem statement = https://codeforces.com/problemset/problem/4/A


/**
 * watermelon
 */

import java.util.*;
public class watermelon {

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int w = scn.nextInt();
            String s = (w % 2 == 0 && w > 2)? "YES":"NO";
            System.out.print(s);
      }
}