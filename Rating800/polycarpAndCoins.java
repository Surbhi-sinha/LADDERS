package Rating800;

// problem link = https://codeforces.com/problemset/problem/1551/A
import java.util.*;
public class polycarpAndCoins {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tc = scanner.nextInt();
            while(tc-- > 0){
                  int n = scanner.nextInt();
                  int c1 = n/3 ,c2 =c1;
                  if(n % 3 == 1){
                        c1+=1;
                  }else if(n%3 == 2){
                        c2+=1;
                  }
                  System.out.println(c1 +" " +c2);
            }
      }
}
