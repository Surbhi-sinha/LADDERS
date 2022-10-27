package Rating800;
import java.util.*;
public class IWannaBetheGuy {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numberOfLevel = sc.nextInt();

            int x = sc.nextInt();
            int[] xpass = new int[x];
            for(int i = 0; i < x; i++) {
                  xpass[i] = sc.nextInt();
            }

            int y = sc.nextInt();
            int[] ypass = new int[y];
            for(int i = 0; i < y; i++) {
                  ypass[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<Integer>();
            for(int i = 0 ; i < x; i++) {
                  if(!set.contains(xpass[i])) {
                        set.add(xpass[i]);
                  }
            }

            for(int i = 0; i < y; i++) {
                  if(!set.contains(ypass[i])) {
                        set.add(ypass[i]);
                  }
            }

            for(int i = 1; i <= numberOfLevel; i++) {
                  if(!set.contains(i)) {
                        System.out.println("Oh, my keyboard!");
                        return;
                  }
            }

            System.out.println("I become the guy.");
      }
}
