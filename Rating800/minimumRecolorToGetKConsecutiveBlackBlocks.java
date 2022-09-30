package Rating800;
import java.util.*;
public class minimumRecolorToGetKConsecutiveBlackBlocks {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            int k = scn.nextInt();
            System.out.println(minimumRecolors(str, k));
      }

      public static int minimumRecolors(String blocks , int k){
            //sliding window question with size k. and count minimum number of white blocks in that window.
            int ans = (int)1e9; // basically ans is min of all the whites in the window
            int i = 0 , j = 0;
            int countOfW  =0;
            while(j < blocks.length()){
                  //calculate ans;
                  if(blocks.charAt(j) == 'W'){
                        countOfW++;
                  }

                  if(j-i+1 < k){
                        j++;
                  }else if(j-i+1 == k){
                        //calulate ans from calculations
                        ans = Math.min(ans , countOfW);
                        //sliding window;
                        if(blocks.charAt(i) == 'W'){
                              countOfW--;
                        }
                        i++;
                        j++;
                  }
            }
            return ans;
      }
}
