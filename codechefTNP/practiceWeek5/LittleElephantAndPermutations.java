package codechefTNP.practiceWeek5;
import java.util.*;
public class LittleElephantAndPermutations {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0){
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }

                  int numInver = 0;
                  // The number of inversions is equal to the number of pairs of integers (i; j) such that 1 ≤ i < j ≤ N and A[i] > A[j], 
                  // and the number of local inversions is the number of integers i such that 1 ≤ i < N and A[i] > A[i+1].
                  for(int i = 0; i < n; i++){
                        for(int j = i+1 ; j < n; j++){
                              if(arr[i] > arr[j]){
                                    numInver++;
                              }
                        }
                  }


                  int localInver = 0;
                  for(int i = 0; i < n-1; i++){
                        if(arr[i] > arr[i+1]){
                              localInver++;
                        }

                  }

                  if(localInver == numInver){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
                  }
            }
      }
}
