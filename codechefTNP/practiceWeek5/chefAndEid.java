package codechefTNP.practiceWeek5;
import java.util.*;

public class chefAndEid {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }

                  Arrays.sort(arr);
                  int min = Integer.MAX_VALUE;
                  for(int i = 0; i < n-1; i++){
                        if(arr[i+1] - arr[i] < min){
                              min = arr[i+1]-arr[i];
                        }
                  }

                  System.out.println(min);
            }
      }      
}
