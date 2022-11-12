package Rating800;
import java.util.*;
public class teamOlympiad {
      public static class Pair{
            int t = 0;
            int idx =0;
            public Pair(int t, int idx) {
                  this.t = t;
                  this.idx = idx;
            }
      }
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] talent = new int[n];
            for(int i=0; i<talent.length; i++){
                  talent[i] = scn.nextInt();
            }

            ArrayList<Pair> programmer = new ArrayList<Pair>();
            ArrayList<Pair> maths = new ArrayList<Pair>();
            ArrayList<Pair> player = new ArrayList<Pair>();

            for(int i=0; i<talent.length; i++){
                  if(talent[i] == 1){
                        programmer.add(new Pair(talent[i] , i+1));
                  }else if(talent[i] == 2){
                        maths.add(new Pair(talent[i] , i+1));
                  }else if (talent[i] == 3){
                        player.add(new Pair(talent[i] , i+1));
                  }
            }


            // number of teams
            if(programmer.size() == 0 || maths.size() == 0 || player.size() == 0){
                  System.out.println(0);
            }else{
                 int size = Math.min(programmer.size(), Math.min(maths.size() , player.size()));
                 System.out.println(size);
                 for(int i = 0; i < size; i++){
                  System.out.println(programmer.get(i).idx +" " + maths.get(i).idx +" " + player.get(i).idx);

                 }
            }

      }
      
}
