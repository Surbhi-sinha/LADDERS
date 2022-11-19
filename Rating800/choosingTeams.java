package Rating800;
import java.util.*;
public class choosingTeams {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                  arr[i] =5 - scn.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++){
                  if(arr[i] >= k){
                        count++;
                  }
            }

            System.out.println(count/3);

            
      }
}
