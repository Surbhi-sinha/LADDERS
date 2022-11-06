import java.util.*;
public class hiringTest {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt(); // n = number of students
                  int m = scn.nextInt(); // m = number of questions
                  int x = scn.nextInt(); // x = number of questions need to be fullysolved
                  int y = scn.nextInt(); // y = number of questions partially solved

                  //condition hai ki pass tabhi honge if x ya x se jyadaa fully solved ho OR x-1 fully solved ho or y partially solved honge

                  // now n lines of string containing m charaters representing the result of ith student

                  String[] result = new String[n];
                  for(int i=0; i<n; i++){
                        result[i] = scn.next();
                  }
                  StringBuilder sb = new StringBuilder();
                  for(int i=0; i<n; i++){
                        int Fcount = 0 , Pcount = 0;
                        String str = result[i];
                        for(int  j= 0 ; j < str.length() ; j++){
                              if(str.charAt(j) == 'F'){
                                    Fcount++;
                              }else if(str.charAt(j) == 'P'){
                                    Pcount++;
                              }
                        }

                        if(Fcount >= x){
                              sb.append('1');
                        }else if(Fcount == x-1 && Pcount >= y){
                              sb.append('1');
                        }else{
                              sb.append('0');
                        }
                  }

                  System.out.println(sb.toString());
            }
      }
}
