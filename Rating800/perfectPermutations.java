package Rating800;
import java.util.*;
public class perfectPermutations {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];

            if(n == 1) System.out.println(-1);
            else{

            
            for(int i = 0 ; i < n ; i++) {
                  arr[i] = i+1;
            }

            for(int i = 0 ; i < n-1 ; i = i +2) {
                  swap(arr , i , i+1);
            }

            for(int i = 0 ; i < n; i++){
                  System.out.print(arr[i] + " ");
            }
      }
      }

      public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }
}
