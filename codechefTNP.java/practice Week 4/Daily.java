import java.util.*;
public class Daily {
      public static void main(String[] args) throws java.lang.Exception {
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();//number of friends
            int n = scn.nextInt(); // number of cars
            int allsum = 0;
            while(n-- > 0) {
                  String s = scn.next();
                  int k = 53; // used for the bottom compartants
                  for(int j = 0 ; j < 36 ; j++){
                        //j is used for the  compartments since total 9 compartantments have groups of 4 compartments
                        int sum = 0;
                        int t = 0 ; // t= top seats
                        int b = 0; // b = bottom seats
                        while(b < 2){
                              if(s.charAt(k) == '0'){
                                    sum = sum + 1;
                              }
                              k = k-1;
                              b = b+1;
                        }
                        while(t<4){
                              if(s.charAt(j) == '0'){
                                    sum = sum + 1;
                              }
                              t = t+1;
                              j=j+1;
                        }

                        
                        j = j-1;

                        if(sum-x >= 0){
                              allsum = allsum + fact(sum)/(fact(x)*fact(sum-x));
                        }
                  }
            }
            System.out.println(allsum);

      }

      public static int fact(int n){
            int a = 1;
            for(int i = 1 ; i <= n ; i++){
                  a*=i;
            }
            return a;
      }
}
