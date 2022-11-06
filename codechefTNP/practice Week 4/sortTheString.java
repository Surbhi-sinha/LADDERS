import java.util.*;
public class sortTheString {
     
    // Driver code
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        while(tc-- > 0){
            int n = scn.nextInt();
            String bits = scn.next();
            //simple soltion to this problem is to count the number of "10" pairs in the stringTask
            int count = 0;
            for(int i = 0 ; i < bits.length()-1; i++){
                if(bits.charAt(i) == '1' && bits.charAt(i+1) == '0'){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    
}
