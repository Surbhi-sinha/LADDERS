package Codeforces;
import java.util.*;
public class median {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int[] arr = new int[3];
                  for(int i = 0; i < arr.length; i++){
                        arr[i] = scn.nextInt();
                  }

                  Arrays.sort(arr);
                  System.out.println(arr[1]);
            }
      }
}
