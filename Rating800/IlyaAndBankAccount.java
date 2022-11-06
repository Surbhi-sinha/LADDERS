package Rating800;
import java.util.*;
public class IlyaAndBankAccount {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int div = n / 10; // removing last digit
            int secLast = n/100;
            secLast = secLast*10 + n%10;
            int ans =  Math.max(n , Math.max(div , secLast));
            System.out.println(ans);
      }
}
