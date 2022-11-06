package codechefTNP.practiceWeek5;
import java.util.*;
/**
 * balancedReversals
 */
public class balancedReversals {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0) {
	        int n = sc.nextInt();
	        String s = sc.next();
	        int zeroes = 0, ones = 0;
	        for(int i = 0; i < n; i++) {
	            if(s.charAt(i) == '0')
	                zeroes++;
	            else
	                ones++;
	        }
	        for(int i = 0; i < zeroes; i++)
	            System.out.print("0");
	        for(int i = 0; i < ones; i++)
	            System.out.print("1");
	        System.out.println();
	    }
      }
}