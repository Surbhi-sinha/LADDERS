package LcPending;
import java.util.*;
public class subArraySumDivisibleByK {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i]  = scn.nextInt();
            }
            int k = scn.nextInt();

            int ans = prefixSum(arr , k);
            System.out.println(ans);
      }
      public static int prefixSum(int[] nums , int  k){
            int sum = 0;
            int ans = 0;
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
            map.put(0, 1);
            for(int i = 0; i < nums.length; i++){
                  sum += nums[i];
                  int rem = ((sum % k)+k) % k;
                  if(!map.containsKey(rem)){
                        map.put(rem , 1);
                  }else{
                        map.put(rem , map.get(rem)+1);
                  }
            } 
            for(int val : map.keySet()){
                  ans += map.get(val)*(map.get(val)-1);
            }
            return ans;
      }
}
