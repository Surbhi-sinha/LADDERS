package Rating800;
import java.util.*;

public class hemantTest {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; i++) {
                  list.add( scn.nextInt());
            }

            int m = scn.nextInt();
            int ans =  minimizeMemory(list , m);
            System.out.println(ans);
      }
      public static int sum(List<Integer> list){
            int sum = 0;
            for(int i = 0 ; i< list.size(); i++){
                  sum+=list.get(i);
            }
            return sum;
      }

      public static int minimizeMemory(List<Integer> processes , int m){
            int n = processes.size() , i = 0 , j = 0 , max = Integer.MIN_VALUE , sum = 0 ;
            while(j < n){
                  sum += processes.get(j);
                  if(j-i+1 == m){

                        max = Math.max(sum,max);
                        sum = sum-processes.get(i);
                        i++;
                  }
                  j++;
            }

            return sum(processes)-max;
      }
}
