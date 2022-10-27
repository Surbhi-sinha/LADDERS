import java.util.*;
public class XorPalindrome {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                  int n = sc.nextInt();
                  String s = sc.next();

                  // i  and j are different indeces and we have to change the Ai and Aj to Ai (XOR) Aj 
                  // find minimum number of operations for making the string a Palindrome

                  int i = 0;
                  int j = n-1;
                  int count = 0;
                  while(i < j){
                        if(s.charAt(i) != s.charAt(j)){
                              count++;
                        }
                        i++;
                        j--;
                  }

                  System.out.println((count+1)/2);
            }
      }
}
