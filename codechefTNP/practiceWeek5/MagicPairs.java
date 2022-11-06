package codechefTNP.practiceWeek5;
import java.util.*;
public class MagicPairs {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long n = sc.nextInt();
		    int arr[] = new int[(int)n];
		    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		    System.out.println(n*(n-1)/2);
		}
      }
}
