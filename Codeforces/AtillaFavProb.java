package Codeforces;
import java.util.*;
public class AtillaFavProb {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt();
                  String str = scn.next();
                  char max = 'a';
                  int ans = str.charAt(0)-96;
                  for(int i = 0 ; i < n ; i++) {
                        if(str.charAt(i) > max){
                              max = str.charAt(i);
                              ans = str.charAt(i)-96;
                        }
                  }
                  System.out.println(ans);
            }
      }
}
