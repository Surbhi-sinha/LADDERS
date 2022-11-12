package Rating800;
import java.util.*;
public class PashmakAndGarden {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int x1 = scn.nextInt();
            int y1 = scn.nextInt();
            int x2 = scn.nextInt();
            int y2 = scn.nextInt();
            
            if(x1 != x2 && y1 != y2 && abs(x1 - x2) != abs(y1 - y2)) {
                  System.out.println(-1);
            }else if(x1 == x2){
                  int X = abs(y1-y2);
                  System.out.println((x1 + X) +" " + y1 +" " + (x2+X) + " "+ (y2));
            }else if(y1 == y2){
                  int Y = abs(x1-x2);
                  System.out.println(x1 +" " + (y1+Y)+ " "+ x2 +" " + (y2+Y) );
            }else{
                  System.out.println(x1 +" " + y2+" " + x2 +" " + y1);
            }
            
      }

      public static int abs(int x) {
            return x>0 ? x:-x;
      }
}
