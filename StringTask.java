/*
 * problem link = https://codeforces.com/problemset/problem/118/A
 */
import java.util.*;

 public class StringTask {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < str.length() ; i++){
                  char ch = str.charAt(i);
                  if(ch != 'a' && ch != 'A' && ch != 'o' && ch != 'O'&& ch != 'y' && ch != 'Y' && ch != 'e' && ch != 'E' && ch != 'u' && ch != 'U' && ch != 'i' && ch != 'I'){
                        ans.append(".");
                        if(ch >= 'A' && ch<= 'Z'){
                              ch = Character.toLowerCase(ch);
                        }
                        ans.append(ch);
                  }
            }
            System.out.println(ans);
      }
}
