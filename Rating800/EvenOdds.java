package Rating800;

import java.util.*;

public class EvenOdds {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long k = sc.nextLong();
            long half = n / 2;
            if (n % 2 == 1) {
                  half++;
            }
            long ans;
            if (k <= half) {
                  ans = 1l + 2l * (k - 1l);
            } else {
                  k = k - half;
                  ans = 2l + 2l * (k - 1l);
            }
            System.out.println(ans);
      }
}