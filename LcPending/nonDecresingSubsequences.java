package LcPending;
import java.util.*;
public class nonDecresingSubsequences {
            public static void main(String[] args) {
                  Scanner scn = new Scanner(System.in);
                  int n = scn.nextInt();
                  int[] nums = new int[n];
                  for(int i = 0; i < nums.length; i++){
                        nums[i] = scn.nextInt();
                  }

                  List<List<Integer>> sequences = findSubsequences(nums);
            }
            static Set<List<Integer>> ans;
            public static List<List<Integer>> findSubsequences(int[] nums) {
                  ans = new HashSet<>();
                  List<Integer> curr = new ArrayList<>();
                  backtrack(0 ,nums, curr , ans );
                  
                return new ArrayList<>(ans);
            }
        
            public static void backtrack(int idx,int[] nums , List<Integer> curr , Set<List<Integer>> ans ){
                
                    if(  curr.size() > 1){
                        ans.add(new ArrayList<>(curr));
                    }
                  
                
            
            //lena 
                  for(int i = idx ; i < nums.length ; i++){
                        if(curr.size() == 0 || nums[i] >= curr.get(curr.size()-1)){
                              curr.add(nums[i]);
                              backtrack(i+1, nums, curr, ans);
                              curr.remove(curr.size()-1);
                        }
                  }

            }
            
}

