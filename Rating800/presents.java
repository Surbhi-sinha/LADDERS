package Rating800;

import java.util.*;
public class presents {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = sc.nextInt();
            }
            int[] ans = new int[arr.length];
            int i = 1;
            while(i <= n){
                  ans[arr[i-1]-1] = i;
                  i++;
            }

            for(int val : ans){
                  System.out.print(val+" ");
            }
      }
}
