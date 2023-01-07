package LcPending;
import java.util.*;

public class minNumOfArrowsToBurstAllBallons {
      public static class Pair{
            int st , en;
            public Pair(int st , int en){
                  this.st = st;
                  this.en = en;
            }
      }
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            Pair[] pairs = new Pair[n];
            for(int i = 0; i < n; i++){
                  int st = scn.nextInt();
                  int en  = scn.nextInt();
                  Pair p = new Pair(st, en);
                  pairs[i] = p;
            }

            Arrays.sort(pairs , (a,b) -> (a.en - b.en));
            
            int prev = 0, count = 1;
            for(int i = 1 ; i < pairs.length ; i++){
                  if(pairs[i].st >= pairs[prev].en){
                        count++;
                        prev = i;
                  }
            }

            System.out.println(count);
      }
}
