package Rating800;
import java.util.*;
public class OddSet {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                  int n = sc.nextInt();
                  int[] arr = new int[2*n];
                  for(int i = 0 ; i < arr.length ;i++){
                        arr[i] = sc.nextInt();
                  }

                  int even = 0 , odd = 0 ;
                  for(int val : arr){
                        if(val %2 == 0) even++;
                        else odd++;
                  }

                  System.out.println((even == odd)? "YES":"NO");
            }
      }
}
