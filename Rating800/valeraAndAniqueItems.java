package Rating800;
import java.util.*;
public class valeraAndAniqueItems {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int v = scn.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int i = 0 ; i < n ; i++){
                  boolean u = false;
                  int k = scn.nextInt();
                  for(int  j = 0 ; j < k ; j++){
                        int s = scn.nextInt();
                        if( !u && v > s){
                              u = true;
                              a.add(i);
                        }
                  }
            }


            System.out.println(a.size());

            String str = "";
            for(int i = 0 ; i < a.size() ; i++){
                  str += (a.get(i)+1) + " ";
            }

            System.out.println(str);
      }
}
