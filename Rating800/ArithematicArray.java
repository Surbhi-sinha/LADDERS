package Rating800;
import java.util.*;
// problem link = https://codeforces.com/problemset/problem/1537/A
public class ArithematicArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                  }

                  int sum = 0;
                  for(int val : arr){
                        sum+= val;
                  }

                  if(sum == n){
                        System.out.println(0);
                  }else if(sum < n){
                        System.out.println(1);
                  }else if(sum > n){
                        System.out.println(sum-n);
                  }
            }
      }
}
