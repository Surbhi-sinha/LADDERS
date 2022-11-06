package Rating800;
import java.util.*;
public class GameWithSticks {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n > m){
                  int temp = n;
                  n = m;
                  m = n;
            }
            if(n % 2 == 0){
                  System.out.println("Malvika");
            }else{
                  System.out.println("Akshat");
            }
      }
}
