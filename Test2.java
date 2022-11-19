/**
 * Test2
 */
import java.util.*;

public class Test2 {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int number = scn.nextInt();
            // printCharacterPattern(number);
            int ans = countDigits(number);
            System.out.println(ans);
      }

      public static void printCharacterPattern(int num){
            int i , j ;
            char ch = 'a';
            char print;
            for(i = 0 ; i < num ; i++){
                  print = ch;
                  for(j = 0 ; j <= i ;j++){
                        System.out.print((print++));
                  }
                  System.out.println();
            }
      }

      public static int countDigits(int n){
            int count = 0;
            int num = n;
            while(num != 0){
                  num = num/10;
                  count++;
            }
            
            return (n % count);
      }
      
}