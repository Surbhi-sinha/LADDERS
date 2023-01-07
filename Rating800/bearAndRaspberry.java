package Rating800;
import java.util.*;
public class bearAndRaspberry {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int c = scn.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                  arr[i] = scn.nextInt();
            }
            int max_diff = Integer.MIN_VALUE;
            for(int i = 0 ; i < n-1 ; i++){
                  if(arr[i] - arr[i+1]> max_diff){
                        max_diff = arr[i]-arr[i+1];
                  }
            }
            if(max_diff < 0 ||max_diff-c < 0){
                  System.out.println(0);
            }else
                  System.out.println(max_diff-c);
      }
}
