package Rating800;
import java.util.*;
public class foxAndSnake {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int level = 1;
            for(int i = 1; i <= n; i++) {
                  int j = m;
                        if( i % 2 == 1){
                              for(int k = 1 ; k <= j ; k++){
                                    System.out.print("#");
                              }
                        }else{
                              if(level == 1){
                                    for(int k = 1 ; k < j ; k++){
                                          System.out.print(".");
                                    }
                                    System.out.print("#");
                                    level = 0;
                              }else if(level == 0){
                                    System.out.print("#");
                                    for(int k = 1 ; k < j ; k++){
                                          System.out.print(".");
                                    }
                                    level = 1;
                              }
                        }
                  System.out.println();
            }
      }
}
