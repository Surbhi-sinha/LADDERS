import java.util.*;
public class coolName {
      public static void main(String[] args) {
            HashMap<Character , Integer> map = new HashMap<Character, Integer>();
            int place = 1;
            for(char ch = 'a'; ch <= 'z'; ch++) {
                  map.put(ch , place);
                  place++;
            }
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            while(n-- > 0){
                  String str = scn.next();
                  char[] c = str.toCharArray();
                  Arrays.sort(c);
                  
                  int ans= 0;
                  for(int i = 0; i < c.length; i++){
                        ans+= (i+1)*(map.get(c[i]));
                  }

                        System.out.println(ans);

                  
            }
      }
}
