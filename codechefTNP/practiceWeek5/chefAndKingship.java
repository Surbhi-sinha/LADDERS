package codechefTNP.practiceWeek5;
import java.util.*;
public class chefAndKingship {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int tc = scn.nextInt();
            while(tc-- > 0 ){
                  int n = scn.nextInt();
                  long[] arr = new long[n];
                  long min = Integer.MAX_VALUE;
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                        min = Math.min(min , arr[i]);

                  }

                  long sum = 0 ; 
                  for(int i = 0; i < n; i++){
                        sum += (min*arr[i]);
                  }

                  System.out.println(sum-(min*min));
            }

            
      }
}
