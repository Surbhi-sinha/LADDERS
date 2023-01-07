package Codeforces;
import java.util.*;
public class BinaryInversions {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scn.nextInt();
            }
            
            int count = countInv(arr , 0);
            System.out.println(count+" ---- ");
            int[] temp = Arrays.copyOf(arr,n);
            int Zfroml = 0;
            for(int i= 0 ; i < n ; i++){
                  if(arr[i] == 0){
                        Zfroml = i;
                        break;
                  }
            }
            System.out.println(Zfroml);
            temp[Zfroml] = 1;

            int zto1 = countInv(temp , Zfroml);


            int[] temp2 = Arrays.copyOf(arr,n);
            int Ofromr = 0;
            for(int i= n-1 ; i >= 0 ; i--){
                  if(arr[i] == 1){
                        Ofromr = i;
                        break;
                  }
            }
            System.out.println(Ofromr);
            temp2[Ofromr] = 1;

            int oto0 = countInv(temp2 ,Ofromr);

            System.out.println(Math.max(count ,Math.max(zto1 , oto0)));
      }

      public static int countInv(int[] arr , int idx){
            int count = 0;
            int n = arr.length;
            for(int i= idx ; i < n-1; i++){
                  if(arr[i] == 1){
                        for(int j= i+1 ; j < n; j++){
                              if(arr[j] == 0){
                                    count++;
                              }
                        }
                  }
            }
            return count;
      }

}
