package Rating800;
import java.util.*;
public class Expression {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int ans = a+b+c;
            ans = Math.max(ans , Math.max(a*b*c, Math.max((a*(b+c)) , ((a+b)*c) )));
            System.out.println(ans);
      }
}
