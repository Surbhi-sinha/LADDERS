package Rating800;
import java.util.*;
public class GregWorkout {
      public static void main(String[] args) {
            Scanner scn  = new Scanner(System.in);
            int n = scn.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                  a[i] = scn.nextInt();
            }
            if(n == 2){
                  String res = "";
                  res = (a[0] > a[1]) ? "chest":"biceps";
                  System.out.println(res);
            }else {
            int[] ans = new int[3];
            for(int i = 0; i < n; i++){
                  if(i%3 == 0){
                        ans[i%3] += a[i];
                  }else if(i % 3 == 1){
                        ans[i%3] += a[i];
                  }else if(i % 3 == 2){
                        ans[i%3] += a[i];
                  }
            }
            
            int max = Integer.MIN_VALUE;
            String res = "";
            for(int i = 0; i < 3 ; i++){
                  if(max < ans[i]){
                        max = ans[i];
                        if(i == 0){
                              res = "chest";
                        }else if(i == 1){
                              res = "biceps";
                        }else if(i == 2){
                              res = "back";
                        }
                  }
            }

            System.out.println(res);
      }
      }
}
