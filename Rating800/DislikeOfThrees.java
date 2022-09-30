package Rating800;
import java.util.*;
// problem link = https://codeforces.com/problemset/problem/1560/A
public class DislikeOfThrees {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                  int k = sc.nextInt();
                  //hume series ka kth val batana hai
            
                  for( int i = 1; ; i++ ){
                        if(i %3 == 0 || i% 10 == 3 ){
                              continue;
                        }
                        if(--k == 0){
                              System.out.println(i);
                              break;
                        }
                        
                  }
            }
      }
}
