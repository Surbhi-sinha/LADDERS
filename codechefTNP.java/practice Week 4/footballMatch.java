import java.util.*;


public class footballMatch {
      public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		   int n=sc.nextInt();
		   String a="", b="";
		   int x=0,y=0;
		   while(n-->0)
		   {
	         String s=sc.next();
	         if(a.equals(""))
	          a=s;
	         if(a.equals(s))
	          ++x;
	         else if(b.equals(""))
	          {b=s;++y;}
	         else ++y;
		   }
		   if(x>y)System.out.println(a);
		   else if(y>x)System.out.println(b);
		   else System.out.println("Draw");
		}
	}
}
