package Rating800;

import java.util.*;
public class lecture {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            HashMap<String, String> map = new HashMap<String, String>();
            for(int i = 0 ; i< m ; i++){
                  map.put(scn.next() , scn.next());
            }

            String[] lecture = new String[n];
            for(int i = 0 ; i < lecture.length ; i++){
                  lecture[i] = scn.next();
            }

            StringBuilder ans = new StringBuilder();

            for(int i = 0 ; i < n ; i++){
                  String lecturelen = lecture[i];
                  int wordlenlec = lecturelen.length();
                  int otherwordlen = map.get(lecturelen).length();
                  if(wordlenlec > otherwordlen){
                        ans.append(map.get(lecturelen)+" ");
                  }else{
                        ans.append(lecturelen +" ");
                  }
            }
            
            System.out.println(ans);
      }
}
