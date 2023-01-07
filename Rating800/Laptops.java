package Rating800;

import java.util.*;

public class Laptops {
      public static class Pair {
            int price;
            int quality;
            public Pair(int price, int quality) {
                  this.price = price;
                  this.quality = quality;
            }
      }

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            Pair[] pairs = new Pair[n];
            for (int i = 0; i < n; i++) {
                  int pi = scn.nextInt();
                  int qi = scn.nextInt();
                  Pair p = new Pair(pi, qi);
                  pairs[i] = p;
            }

            Arrays.sort(pairs , (x,y) -> x.price - y.price);
            int happy = 0;
            for(int i = 0; i < n-1; i++) {
                  if(pairs[i].quality > pairs[i+1].quality){
                        happy = 1;
                        break;
                  }
            }

            if(happy == 1){
                  System.out.println("Happy Alex");
            }else{
                  System.out.println("Poor Alex");
            }

      }
}
