package Rating800;

import java.util.*;
public class hemantTest2 {
    
      public static int minGroups(List<Integer> movies, int diff) {
          
          Collections.sort(movies);
          // dp[i] -> min groups when we have i .. movies.length-1 movies available
          int[] dp = new int[movies.size()+1];
          dp[movies.size()] = 0;
          
          for(int idx=movies.size()-1; idx>=0; idx--) {
              
              // taking only 1 in current group
              dp[idx] = 1 + dp[idx+1];
              
              // trying to take more movies in group
              for(int nextIdx=idx+1; nextIdx<movies.size()-1; nextIdx++) {
                  
                  if(movies.get(nextIdx) > movies.get(idx) + diff) {
                      break;
                  } else {
                      dp[idx] = Math.min(dp[idx], 1 + dp[nextIdx+1]);
                  }
              }
          }
          
          return dp[0];
      }
      
      public static void main(String[] args) {
          
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        List<Integer> arr = new ArrayList<Integer>();
          for(int i = 0 ; i < n ;i++){
            arr.add(scn.nextInt());
          }

          int diff = scn.nextInt();
          System.out.println(minGroups(arr, diff));
      }
  }