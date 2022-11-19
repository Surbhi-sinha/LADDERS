/**
 * Test
 *
 */

 import java.util.*;
public class Test {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        int secondmax = arr[n-2];

        System.out.println(max+secondmax);

    }
}