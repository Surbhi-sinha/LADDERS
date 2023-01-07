package LcPending;

/**
 * InnergasStation
 **/
import java.util.*;

public class gasStation {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] gas = new int[n];
            int[] cost = new int[n];
            for(int i = 0; i < n ; i++){
                  gas[i] = scn.nextInt();
            }

            for(int i = 0; i < n ; i++){
                  cost[i] = scn.nextInt();
            }

            System.out.println(canCompleteCircuit(gas, cost));
      }    

      public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0 , avail = 0 , ind = 0;

        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            avail += gas[i] - cost[i];
            if(avail < 0 ){
                  avail = 0;
                  ind =i +1;
            }
        }

        return total < 0 ? -1 : ind;
      }
}
