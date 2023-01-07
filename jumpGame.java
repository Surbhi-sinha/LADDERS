import java.util.*;

public class jumpGame {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scn.nextInt();
            }
            
            boolean ans = canJump(arr );
            System.out.println(ans);
      }      

      public static boolean canJump(int[] arr ){
           boolean[] dp = new boolean[arr.length];
           Arrays.fill(dp, false);
           dp[arr.length-1] = true;
           for(int i = arr.length - 2; i >= 0; i--){
                  if(arr[i] == 0){
                        dp[i] = false;
                  }else{
                        if(arr[i]+ i >= arr.length){
                              dp[i] = true;
                        }else{
                              for(int j = 1 ; j <= arr[i]; j++){
                                    dp[i] = dp[i] || dp[i+j];
                                    j = j+arr[i+j];
                              }
                        }
                  }
           }
           return dp[0];
      }
}
