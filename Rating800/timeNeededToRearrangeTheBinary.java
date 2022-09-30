package Rating800;
import java.util.*;
public class timeNeededToRearrangeTheBinary {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(secondsToRemoveOccurrences(str));
      }

      public static int secondsToRemoveOccurrences(String s) {
            int seconds = 0;
            while (s.indexOf("01") >= 0) {
                s = s.replace("01", "10");
                ++seconds;
            }
            return seconds;
        }
}
