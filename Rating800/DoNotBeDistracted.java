package Rating800;
import java.util.*;
// problem link = https://codeforces.com/problemset/problem/1520/A

public class DoNotBeDistracted {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0) {
                  int n = sc.nextInt();
                  String s = sc.next();
                  
                  // basically hume same character kisi string me ek hi flow me chahiye
                  int[] alphabet = new int[26];
                  int i = 0 ;
                  while(i < n){
                        alphabet[s.charAt(i)-'A'] = 1; 
                        while(s.charAt(i) == s.charAt(i+1)){
                              i++;
                        }

                        if(alphabet[s.charAt(i)-'A'] > 0){
                              System.out.println("NO");
                              break;
                        }
                        i++;
                  }

                  System.out.println("YES--------");
            }
      }
}
