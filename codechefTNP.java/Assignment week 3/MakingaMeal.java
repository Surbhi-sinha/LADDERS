import java.util.*;
public class MakingaMeal {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int n = scn.nextInt();
                  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                  map.put('c' , 0);
                  map.put('o' , 0);
                  map.put('d' , 0);
                  map.put('e' , 0);
                  map.put('h', 0);
                  map.put('f', 0 );
                  
                  while(n-- > 0){
                        String s = scn.next();
                        for(int i=0; i < s.length(); i++){
                              char ch = s.charAt(i);
                              if(map.containsKey(ch)){
                                    map.put(ch ,map.get(ch)+1);
                              }
                        }
                  }

                  map.put('c' , map.get('c')/2);
                  map.put('e' , map.get('e')/2);
                  
                  int min = Integer.MAX_VALUE;
                  for(char ch : map.keySet()){
                        if(map.get(ch) < min){
                              min = map.get(ch);
                        }
                  }
                  System.out.println(min);

            
            }
      }
}
