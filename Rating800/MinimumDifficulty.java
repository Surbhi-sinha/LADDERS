package Rating800;
import java.util.*;
public class MinimumDifficulty {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1; i <= n; i++){
                  arr[i] = scn.nextInt();     
            }

            int mindiff = Integer.MAX_VALUE;
            for(int i = 2; i < n; i++){
                  
                  int diff = Integer.MIN_VALUE;
                  for(int j = 2 ; j < n; j++){
                        if(j == i){
                              diff = Math.max(diff , arr[j+1]-arr[j-1]);
                        }else{
                              diff = Math.max(diff , arr[j+1] - arr[j]);
                        }
                  }
                  mindiff = Math.min(mindiff, diff);
            }
            System.out.println(mindiff);
            
      }
}
