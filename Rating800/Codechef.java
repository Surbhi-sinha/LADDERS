package Rating800;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
	    int tc = scn.nextInt();
	    while(tc-- > 0){
	        int n = scn.nextInt();
	        int k = scn.nextInt();
	        
	        int[] arr = new int[n];
	        for(int i =0 ; i < n ; i++){
	            arr[i] = scn.nextInt();
	        }
	        
	        int wolves = 0;
	        for(int i = 0 ; i < n ; i++){
	            if((arr[i]+k)%7 == 0){
	                wolves++;
	            }
	        }
	        System.out.println(wolves);  
	    }
	}
}
