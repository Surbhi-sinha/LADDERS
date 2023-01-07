// import java.util.*;

// import javax.swing.plaf.synth.SynthSplitPaneUI;

// public class makeItRound {
//       public static void main(String[] args) {
//             Scanner scn = new Scanner(System.in);
//             int tc = scn.nextInt();
//             while(tc-- > 0){
//                   int n = scn.nextInt();
//                   int m = scn.nextInt();
//                   int maxZero = 0;
//                   int maxnum = 0;
//                   for(int i = m ; i >= 1 ; i--){
//                         if(i % 5 == 0 || n % 5 == 0){
//                               int num = i*n;
//                               int cntzero = countZeroes(num);
//                               if( cntzero > maxZero){
//                                     maxZero = cntzero;
//                                     maxnum = num;
//                               }
//                         }
//                   }
//                   // System.out.print("-----ans=>");
//                   if(maxZero == 0){
//                         System.out.println(n*m);
//                   }else
//                         System.out.println(maxnum);
//             }            
//       }

//       public static int countZeroes(int n){
//             int zeroes = 0;
//             while(n > 0){
//                   int rem = n % 10;
//                   if(rem == 0){
//                         zeroes++;
//                   }else{
//                         break;
//                   }
//                   n = n/10;
//             }
//             // System.out.println(zeroes);
//             return zeroes;
//       }
// }


import java.util.*;
/**
 * makeItRound
 */
public class makeItRound {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int n = scn.nextInt();
                  int m = scn.nextInt();

                  int n0 = n;
                  int cnt2= 0, cnt5 = 0;
                  int k = 1;
                  
                  while (n > 0 && n % 2 == 0) {
                        n /= 2;
                        cnt2++;
                    }
                    while (n > 0 && n % 5 == 0) {
                        n /= 5;
                        cnt5++;
                    }
                    while (cnt2 < cnt5 && k * 2 <= m) {
                        cnt2++;
                        k *= 2;
                    }
                    while (cnt5 < cnt2 && k * 5 <= m) {
                        cnt5++;
                        k *= 5;
                    }
                    while (k * 10 <= m) {
                        k *= 10;
                    }

                    if(k == 1){
                        System.out.println(n0*m);
                    }else{
                        k *= m/k;
                        System.out.println(n0*k);
                    }
            }
      }
      
}