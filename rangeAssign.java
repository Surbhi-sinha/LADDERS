import java.util.*;

public class rangeAssign {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc= scn.nextInt();
Task:       while(tc-- > 0) {
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }

                  if(arr[0] == arr[n-1]){
                        System.out.println("YES");
                        continue;
                  }

                  for(int i = 0; i < n; i++){
                        if(arr[0] == arr[i] && arr[i+1] == arr[n-1]){
                              System.out.println("YES");
                              continue Task;
                        }
                  }
                  System.out.println("NO");

            }      
      }
}
