package Rating800;
import java.util.*;
public class luckydivision {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i= 1;
            for( ; i < n ; i++) {
                  if(isLucky(i)){
                        System.out.println("YES");
                        break;
                  }
                  if(isLucky(i)){
                        if(n % i == 0){
                              System.out.println("YES");
                              break;
                        }
                  }
                  
            }
            i++;
            if(i > n){
                  System.out.println("NO");
            }


      }
      public static boolean isLucky(int n) {
            while(n > 0){
                  int dig = n /10;
                  n = n/10;
                  if(dig == 4 || dig == 7){
                        continue;
                  }else{
                        return false;
                  }
            }
            return true;
      }
}
