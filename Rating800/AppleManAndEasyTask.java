package Rating800;
import java.util.*;
public class AppleManAndEasyTask {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            char[][] arr = new char[n][n];
            for(int i = 0; i < n; i++) {
                  char[] charr = scn.next().toCharArray();
                  arr[i] = charr;
            }
            System.out.println("------------------------ANSWER-----------------------");
            boolean even = true;
            for(int i = 0 ; i < n ; i++){
                  int c = 0;
                  for (int j = 0; j < n; j++)
                  {
                      if (i - 1 >= 0 && arr[i - 1][j] == 'o')
                          c++;
                      if (i + 1 < n && arr[i + 1][j] == 'o')
                          c++;
                      if(j - 1 >= 0 && arr[i][j - 1] == 'o')
                          c++;
                      if(j + 1 < n && arr[i][j + 1] == 'o')
                          c++;
                      if (c % 2 == 1)
                          even = false;
                  }
            }

            if(even == false){
                  System.out.println("NO");
            }else{
                  System.out.println("YES");
            }
      }
}
