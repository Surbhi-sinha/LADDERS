package CompanyQuestions.AMAZON_OA;
import java.util.*;

public class countMaximumOperations {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            String t = scn.next();

            HashMap<Character , Integer> map = new HashMap<Character, Integer>();
            
            for(int i = 0; i < s.length() ; i++){
                  char ch = s.charAt(i);
                  if(!map.containsValue(ch)){
                        map.put(ch , 1);
                  }else{
                        map.put(ch , map.get(ch)+1);
                  }
            }
            boolean flag = true;
            int num = 0;
            while(flag){
                  String str = "";
                  for(int i = 0; i < t.length(); i++){
                        char ch = t.charAt(i);
                        if(!map.containsValue(ch) || map.get(ch) == 0){
                              flag = false;
                        }else{
                              str += ch;
                              map.put(ch , map.get(ch)-1);
                              
                        }
                  }
                  num++;
            }
            num++;
            System.out.println(num);
      }      
}
