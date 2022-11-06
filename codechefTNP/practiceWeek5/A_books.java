package codechefTNP.practiceWeek5;
import java.util.*;
public class A_books {
      public static void main(String[] args)throws java.lang.Exception {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }
                  int[] ans = new int[arr.length];
                  for(int i = 0; i < n; i++){
                        ans[i] = numbergreaterthani(arr , arr[i]);
                  }

                  for(int i = 0; i < n; i++){
                        System.out.print(ans[i] +" ");
                  }
            }
      }

      public static int numbergreaterthani(int[] arr , int val){
            int more = 0;
            for(int i = 0; i < arr.length; i++){
                  if(arr[i] > val){
                        more++;
                  }
            }
            return more;
      }
}
