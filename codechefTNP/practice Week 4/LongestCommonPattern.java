import java.util.*;
public class LongestCommonPattern {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  String A = scn.next();
                  String B = scn.next();

                  char[] aArr = A.toCharArray();
                  char[] bArr = B.toCharArray();
                  Arrays.sort(aArr);
                  Arrays.sort(bArr);
                  int i = 0 , j = 0 , count = 0;
                  while(i < aArr.length && j < bArr.length) {
                        if(aArr[i] == bArr[j]) {
                              count++;
                              i++;
                              j++;
                        }else if(aArr[i] > bArr[j]) {
                              j++;
                        }else if(aArr[i] < bArr[j]) {
                              i++;
                        }
                  }

                  System.out.println(count);

                  

            }
      }
}
