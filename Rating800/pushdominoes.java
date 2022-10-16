package Rating800;
import java.util.*;
public class pushdominoes {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            System.out.println(pushDominoes(s));
      }
      static StringBuilder str = new StringBuilder();
      public static String pushDominoes(String dom) {
            
            int count = 0;
            char last = 'L';
            for(char ch : dom.toCharArray()) {
                  if(ch != '.'){
                        if(ch == last) add(count , last);
                        if(ch == 'L') add(count , '.');
                        else{
                              add(count/2 , 'R');
                              if(count %2 !=0) str.append('.');
                              add(count/2 , 'L');
                        }
                        str.append(ch);
                  }
            }
            return str.toString();      
      }

      public static  void add(int count , char ch ){
            for(int i = 0 ;i < count ; i++){
                  str.append(ch);
            }
      }
}
