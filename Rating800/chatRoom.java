package Rating800;
import java.util.*;
public class chatRoom {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();

            String hello = "hello";
            int j = 0;

            for(int i = 0; i < s.length() && j < hello.length(); i++) {
                  if(s.charAt(i) == hello.charAt(j)) {
                        j++;
                  }
                  
            }

            if(j == hello.length()) {
                  System.out.println("YES");
            }else{
                  System.out.println("NO");
            }
      }
}
