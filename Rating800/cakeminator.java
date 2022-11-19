package Rating800;
import java.util.*;
public class cakeminator {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] row= new int[n];
            int[] col = new int[m];
            
            for(int i = 0; i < n; i++){
                  String s = scn.next();
                  for(int j = 0; j < m ;j++){
                        if(s.charAt(j) == 'S'){
                              row[i] = 1;
                              col[j] = 1;
                        }
                  }
            }

            int cake = 0;
            for(int i = 0; i < n; i++){
                  for(int j = 0; j < m; j++){
                        if(row[i] == 0 || col[j] == 0){
                              cake++;
                        }
                  }
            }

            System.out.println(cake);
      }
}
