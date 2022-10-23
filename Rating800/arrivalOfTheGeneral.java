package Rating800;
import java.util.*;
public class arrivalOfTheGeneral {

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scn.nextInt();
            }

            int high = 0 , low = 0;
            for(int i = 0; i < n; i++){
                  if(arr[i] > arr[high]){
                        high = i;
                  }
                  
                  if(arr[i] <= arr[low]){
                        low = i;
                  }
            }

            int ans = (high-1+n-low);
            if(low < high) ans--; // if the leftmost soldier with the maximum height is more right then the rightmost soldier with the minimum height we should subtract one from the answer.
            System.out.println(ans);
      }
      
}