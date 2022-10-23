package Rating800;
import java.util.*;
public class puzzles {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // number of students
            int m = sc.nextInt();// number of pieces in puzzles
   
            int[] arr = new int[m];
            for(int i = 0; i < m; i++){
                  arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int best = Integer.MAX_VALUE;

            for(int k = 1 ; k < m-n ; k++){
                  best = Math.min(best , arr[k+n-1] - arr[k]);
            }
            System.out.println(best);
      }
}
