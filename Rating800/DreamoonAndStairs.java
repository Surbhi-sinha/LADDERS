package Rating800;
import java.util.*;
public class DreamoonAndStairs {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            
            int lb = (n+1)/2;
            int ans = (lb+m-1)/m * m;
            if(ans > n){ans = -1;}
            System.out.println(ans);

      }
}
