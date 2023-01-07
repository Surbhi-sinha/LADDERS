package LEETCODEBIWEEKLY;
import java.util.*;
public class maxEnemyFort {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scn.nextInt();
            }

            System.out.println(captureForts(arr));
      }

      public static int captureForts(int[] forts) {
            int maxcountZero = 0;
            int n = forts.length;
            for(int i = 0 ; i < n-1 ; i++){
                  for(int j = i+1 ; j < n ; j++){
                        int countZero= 0;
                        if(j == -1){
                              countZero = countZeros( forts , i , j);
                        }
                        if(countZero > maxcountZero){
                              maxcountZero = countZero;
                        }
                  }
            }
            for(int i = n-1 ; i > 0 ; i--){
                  for(int j = i-1 ; j > 0 ; j--){
                        int countZero= 0;
                        if(j == -1){
                              countZero = countZeros( forts , j , i);
                        }
                        if(countZero > maxcountZero){
                              maxcountZero = countZero;
                        }
                  }
            }
            return maxcountZero;
      }

      public static int countZeros(int[] forts, int i  , int j ){
            int cnt = 0;
            for(int k = i ; k  < j ; k++){
                  if(forts[k] == 0){
                        cnt++;
                  }
            }
            return cnt;
      }
}
