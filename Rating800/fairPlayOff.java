package Rating800;
import java.util.*;
// prblem link = https://codeforces.com/problemset/problem/1535/A
public class fairPlayOff {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                  int player1 = sc.nextInt();
                  int player2 = sc.nextInt();
                  int player3 = sc.nextInt();
                  int player4 = sc.nextInt();

                  int[] arr = new int[4];
                  arr[0] = player1;
                  arr[1] = player2;
                  arr[2] = player3;
                  arr[3] = player4;

                  Arrays.sort(arr);
                  int win1 = arr[3] , win2 = arr[2];

                  int round1 = Math.max(player1,player2);
                  int round2 = Math.max(player3,player4);

                  if((round1 == win1 && round2 == win2) || (round1 == win2 && round2 == win1)){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
                  }
            }
      }
}
