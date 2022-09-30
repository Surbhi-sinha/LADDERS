package Rating800;

public class dpp {
      public static void main(String[] args) {
            String s = "Let's take LeetCode contest";
            System.out.println(reverseWords(s));
      }

      public static String reverseWords(String s) {
            String[] arr = s.split(" ");
            for(int i=0; i<arr.length; i++){
                  arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
            String ans = "";
            for(int i = 0 ; i < arr.length ; i++){
                  ans += arr[i]+" ";
            }
            return ans;
      }
}
