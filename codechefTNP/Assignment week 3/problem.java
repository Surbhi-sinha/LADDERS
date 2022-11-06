import java.util.*;
public class problem {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt();
                  String[] arr = new String[n];
                  for(int i = 0; i < n; i++) {
                        arr[i] = scn.next();
                  }

                  int c = 0;
                  for(char ch = 'a' ; ch < 'z'; ch++) {
                        int count = 0;
                        for(int i = 0; i < n; i++) {
                              if(arr[i].contains(Character.toString(ch))){
                                    count++;
                              }

                        }
                        if(count == n){
                              c++;
                        }
                  }

                  System.out.println(c);
            }
      }
}
