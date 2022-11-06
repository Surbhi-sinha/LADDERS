package codechefTNP.practiceWeek5;
import java.util.*;
public class simpleStatistics {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); 
		int t = scan.nextInt(); 
		while(t-->0)
		{
		    int n = scan.nextInt(); 
		    int k = scan.nextInt(); 
		    
		    int[] arr = new int[n]; 
		    
		    for(int i=0;i<n;i++) arr[i] = scan.nextInt(); 
		    
		    Arrays.sort(arr); 
		    int p=0,q=n-1;
		    int count = n-2*k;
		    while(k-->0)
		    {
		        arr[p++] = 0; 
		        arr[q--] = 0;
		    } 

		    double sum = 0; 
		    for(int sd=0;sd<n;sd++)
		    {
		        sum += arr[sd]; 
		    } 
		    double db = sum/count;
		    System.out.println(String.format("%.6f",db));
		}
      }
}
