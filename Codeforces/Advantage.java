package Codeforces;
import java.util.*;
public class Advantage {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }

                  int[] copy = Arrays.copyOf(arr,n);
                  Arrays.sort(copy);
                  int max = copy[n-1];
                  int secMax =copy[n-2];
                  // System.out.println(max + " "+ secMax);
                  int[] ans = new int[n];
                  for(int  i = 0; i < n; i++){
                        if(arr[i] != max){
                              ans[i] = arr[i]-max;
                        }else{
                              ans[i] = arr[i] - secMax;
                        }
                  }

                  for(int i = 0; i < n ; i++){
                        System.out.print( ans[i] +" ");
                  }
                  System.out.println();
            }
      }
}
