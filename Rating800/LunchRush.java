package Rating800;
import java.util.*;

public class LunchRush {
      
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[][] arr = new int[n][2];
            for(int i = 0; i < n; i++){
                  arr[i][0]  = scn.nextInt(); // fi
                  arr[i][1] = scn.nextInt(); // ti
            }

            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < n; i++){
                  if(arr[i][1] > k ){
                        arr[i][0] = arr[i][0] - (arr[i][1] - k);
                        if(arr[i][0] > max) max = arr[i][0];
                  }else{
                        if(arr[i][0] > max) max = arr[i][0];
                  }
            }

            System.out.println(max);
      }
}
