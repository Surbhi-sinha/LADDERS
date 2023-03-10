/**
 * gstushar
 */
import java.util.*;
public class gstushar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {
		int win = needle.length();
		int ans = -1;
		for(int i = 0 ; i <= haystack.length()-win ; i++) {
			if(haystack.substring(i , i+win).equals(needle)){
	
				ans = i;
				break;
			}
		}
		return ans;
	  }
	
}