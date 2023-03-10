package CompanyQuestions.AMAZON_OA;
import java.util.*;
public class findMinimumCCharacters {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String search  = scn.next();
            String result = scn.next();
            int i = 0 , j = 0;
            while(i < search.length() && j < result.length()) {
                  if(search.charAt(j) == result.charAt(i)){
                        j++;
                  }

                  i++;
            }
            System.out.println(result.length() - j);
      }
}
