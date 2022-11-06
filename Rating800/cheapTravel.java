package Rating800;
import java.util.*;
public class cheapTravel {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();
            
            if(m*a <= b){
                  System.out.println(n*a);
            }else{
                  System.out.println((n/m)*b + Math.min((n%m) *a, b));
            }
      }
}
