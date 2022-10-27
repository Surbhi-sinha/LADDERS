package Rating800;
import java.util.*;
public class AntonandLetters {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            
            HashSet<Character> set = new HashSet<Character>();
            for(int i = 0; i < str.length(); i++) {
                  if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                        if(!set.contains(str.charAt(i))){
                              set.add(str.charAt(i));
                        }
                  }
            }
            System.out.println(set.size());
      }
}
