package Rating800;
import java.util.*;
public class luckydivision {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            //lucky and almost lucky
            int temp = n;
            while(temp > 0) {
                  int dig = temp/10;
                  temp = dig /10;
                  if(dig == 4 || dig == 7){
                        continue;
                  }else{
                        System.out.println("NO");
                        break;
                  }
                  
            }

            // almost lucky
            if(n % 4 == 0 || n % 7 == 0){
                  System.out.println("YES");
            }else{
                  System.out.println("NO");
            }
      }
}
