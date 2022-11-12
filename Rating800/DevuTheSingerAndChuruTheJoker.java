package Rating800;
import java.util.*;
public class DevuTheSingerAndChuruTheJoker {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int d = scn.nextInt();
            int[] songtime = new int[n];
            int sum = 0;
            for(int i = 0 ; i < n; i++){
                  songtime[i] = scn.nextInt();
                  sum+=songtime[i];
            }

            if(sum + (n-1)*10 > d){
                  System.out.println(-1);
            }else{
                  System.out.println((d-sum)/5);
            }
      }
}
