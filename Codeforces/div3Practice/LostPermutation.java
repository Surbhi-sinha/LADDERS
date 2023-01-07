import java.util.*;
public class LostPermutation {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int m = scn.nextInt();
                  int s = scn.nextInt();
                  ArrayList<Integer> arr = new ArrayList<Integer>();
                  // int sum = 0;
                  for(int  i = 0; i < m; i++){
                        arr.add(scn.nextInt());
                        // sum+=arr.get(i);
                  }
                  Collections.sort(arr);
                  int max = arr.get(arr.size() - 1);

                  for(int i = 1 ; i <= max ; i++ ){
                        if(!arr.contains(i)){
                              s = s-i;
                        }
                  }

                  int inc = 1;
                  while(s > 0){
                        s = s-(inc + max);
                        inc++;
                  }

                  if(s > 0 || s < 0){
                        System.out.println("NO");
                  }else if(s == 0){
                        System.out.println("YES");
                  }
            } 


      }
      
}
