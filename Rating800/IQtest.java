package Rating800;
import java.util.*;
public class IQtest {
      
      public static void main(String[] args) {
            Scanner scn= new Scanner(System.in);
            int n= scn.nextInt();
            int[] arr = new int[n];

            int countEVEN = 0;
            int countODD = 0;
            int evenIDX = 0;
            int oddIDX = 0;
            for(int i = 0 ; i < n ; i++) {
                  arr[i] = scn.nextInt();
                  if(arr[i] % 2 == 0) {
                        countEVEN++;
                        evenIDX = i+1;
                  }else{
                        countODD++;
                        oddIDX = i+1;
                  }
            }


            if(countEVEN == 1){
                  System.out.println(evenIDX);
            }else if(countODD == 1){
                  System.out.println(oddIDX);
            }


            
      }

      
}
