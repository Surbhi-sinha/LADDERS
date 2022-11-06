
import java.util.*;
public class pawriMeme {
      public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while(tc-- > 0){
		    String s = scn.next();
                StringBuilder ans = new StringBuilder();
                ans.append(s);
                if(s.length() >= 5 && s.substring(s.length()-5 , s.length()).equals("party")) ans.replace(s.length()-5 , s.length() , "pawri");
                for(int i = 0; i < s.length()-5 ;i++){
                        int j = i+5;
                        if(s.length() >= 5 && s.substring(i, j).equals("party")){
                              ans.replace(i , j , "pawri");
                        }
                  }
                  System.out.println(ans.toString());
                }
	}
}

