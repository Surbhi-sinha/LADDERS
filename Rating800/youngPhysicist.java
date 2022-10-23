package Rating800;
import java.util.*;
public class youngPhysicist {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] forces = new int[n][3];
            for(int i = 0; i < n; i++){
                  forces[i][0] = sc.nextInt();
                  forces[i][1] = sc.nextInt();
                  forces[i][2] = sc.nextInt();
            }
            int xi = 0 , yi = 0 , zi = 0;
            for(int i = 0 ; i < n; i++){
                  xi+=forces[i][0];
                  yi+=forces[i][1];
                  zi+=forces[i][2];
            }

            if(xi == 0 && yi==0 && zi==0){
                  System.out.println("YES");
            }else{
                  System.out.println("NO");
            }
      }
}
