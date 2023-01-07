/**
 * YesYes
 */

import java.util.*;
 
public class YesYes {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  String full = "Yes";
                  for(int i = 1 ; i <18 ; i++){
                        full += "Yes";
                  }
                  // System.out.println(full);

                  String str = scn.next();
                  if(str.equals("YES")){
                        System.out.println("NO");
                  }else if(full.contains(str)){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
                  }
            }
      }
      
}