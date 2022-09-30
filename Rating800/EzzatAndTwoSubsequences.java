package Rating800;

import java.util.*;

public class EzzatAndTwoSubsequences {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();

            while (tc-- > 0) {
                  int n = sc.nextInt();
                  ArrayList<Integer> arr = new ArrayList<>();
                  for(int i = 0; i < n; i++) {
                        arr.add(sc.nextInt());
                  }
                  int max = arr.get(0);
                  long sum = 0;
                  for(int i = 0 ; i < n ; i++){
                        if(arr.get(i) > max)
                              max = arr.get(i);
                        
                        sum += arr.get(i);
                  }
                  double ans = 1.0 * (sum-max)/(n-1)+max;
                  System.out.println(ans);
            }
      }

}
