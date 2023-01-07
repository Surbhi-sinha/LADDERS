package Codeforces;
import java.util.*;
public class challengingValley {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int tc = scn.nextInt();
            while(tc-- > 0) {
                  int n = scn.nextInt();

                  //Actually the question is strictly increaasing or strictly deacreasing or first decring ans then increasing only are the solutions
                  ArrayList<Integer> arr = new ArrayList<>();
                  for(int i = 0; i < n; i++){
                        int x = scn.nextInt();
                        if(i == 0 || x != arr.get(arr.size()-1)){
                              arr.add(x);
                        }
                  }

                  int num_valley = 0;
                  for(int i = 0 ; i < arr.size() ; i++){
                        if((i == 0 || arr.get(i-1) > arr.get(i)) && (i == arr.size()-1 || arr.get(i) < arr.get(i+1))){
                              // first statement is for strictly decreasing and sencond statement is for strictlty decresing and 
                              //the combination of only one mid point will result in third condition of first decresing then incrcesing/
                              num_valley++;
                        }
                  }

                  if(num_valley == 1){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
            
                  }
            
         }
      }

}
