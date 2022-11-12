package Rating800;
import java.util.*;
public class Dragons {
      public static class Pair{
            int dra = 0;
            int powergain = 0;
            public Pair(int dra, int powergain) {
                  this.dra = dra;
                  this.powergain = powergain;
            }
      }
      public static void main(String[] args) {
            Scanner scn = new Scanner (System.in);
            int s = scn.nextInt();
            int n = scn.nextInt();
            int[] dragon = new int[n];
            int[] power = new int[n];
            for(int i = 0; i < n; i++){
                  dragon[i] = scn.nextInt();
                  power[i] = scn.nextInt();
            }
            Pair[] arr = new Pair[n];
            
            for(int i = 0; i < n; i++){
                  Pair p = new Pair(dragon[i], power[i]);
                  arr[i] = p;
            }

            Arrays.sort(arr ,(a,b) -> a.dra-b.dra);
            boolean flag = true;
            for(int idx = 0; idx < n; idx++){
                  if(arr[idx].dra < s){
                        s+=arr[idx].powergain;
                  }else{
                        flag = false;
                        break;
                  }                  
            }


            if( flag == true){
                  System.out.println("YES");
            }else{
                  System.out.println("NO");
            }
      }      
}