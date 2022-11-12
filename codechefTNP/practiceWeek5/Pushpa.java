package codechefTNP.practiceWeek5;
import java.util.*;
public class Pushpa {
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
                  int max = 0;
                  int c = 0;
                  if(n == 1) {
                        System.out.println(arr[0]);
                  }else{
                        for(int i = n-1 ; i >= 1 ; i--){
                              if(arr[i] == arr[i-1]){
                                    c++;
                              }else{
                                    if(max < arr[i]+c ) max = arr[i] + c;
                                    c=0;
                              }
                        }
                        if(max < arr[0]+c) max = arr[0] + c;
                        System.out.println(max);
                  }

                  

            }

      }

      
}
