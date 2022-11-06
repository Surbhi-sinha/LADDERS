import java.util.*;
public class nonAdjacentFlips {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  //minimum number of flips to convert all characters of s into 0;
                  int n = scn.nextInt();
                  String s = scn.next();
                  
                  //yaha pr yeah check kr lete hai ki saare number 0 hai ki nhi 
                  boolean all0 = true;
                  for(int i = 0 ; i < s.length() ; i++){
                        if(s.charAt(i) == '1'){
                              all0  = false;
                              break;
                        }
                  }

                  boolean adjacent1 = false;
                  // loop me sirf yeah check kr lete hai ki 1 k  indices adjacent hai ya nhi agar hai to 2 hoga and else 1 
                  for(int i = 1 ; i < s.length() ; i++){
                        if(s.charAt(i) == '1' && s.charAt(i-1) == '1'){
                              adjacent1 = true;
                              break;
                        }
                  }

                  if(all0 == true){
                        System.out.println(0);
                  }else if(adjacent1 == false){
                        System.out.println(1);
                  }else if(adjacent1 == true){
                        System.out.println(2);
                  }
            }
      }
}
