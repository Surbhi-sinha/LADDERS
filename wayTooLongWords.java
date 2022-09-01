/*
 * way Too Long words
 * 
 * problem link = https://codeforces.com/problemset/problem/71/A
 */

import java.util.*;
public class wayTooLongWords {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            for(int i = 1 ; i <= n ; i++) {
                  String str = scn.next();
                  char fchar = str.charAt(0);
                  String lenbetween = Integer.toString(str.length()-2);
                  char lchar = str.charAt(str.length()-1);
                  String ans = fchar+lenbetween+lchar;
                  if(str.length() > 10){
                        System.out.println(ans);
                  }else{
                        System.out.println(str);
                  }
            }
      }
}