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
                  int num = 1;
                  int i = 1;
                  while( i<= k ){
                        if(num%3 == 0 ){
                              num++;
                        }
                        if(num%10 == 3){
                              num++;
                        }
                        num++;
                        i++;
                  }
                  System.out.println(num-1+"ans");
            }
      }
}
