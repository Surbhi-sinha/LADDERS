package Rating800;
import java.util.*;
public class twins{
      public static void main(String[] args) {
            
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scn.nextInt();
            }
            
            int half= 0 , sum = 0;
            for(int i = 0; i < n; i++){
                  sum+= arr[i];
            }
            half = sum / 2;
            
            Arrays.sort(arr);
            sum = 0;
            int coins = 0;
            for(int i = n-1 ; i >= 0 ; i--){
                  sum += arr[i];
                  coins++;
                  if(sum > half){
                        break;
                  }
            }

            System.out.println(coins);

      }

}
