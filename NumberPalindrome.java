import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(pal(n));
	}
	public static boolean pal(int n)
	{
	    int rem = 0;
	    int res = n;
	    while(n>0)
	    {
	        int d = n%10;
	        rem = rem*10+d;
	        n=n/10;
	    }
	    if(rem==res)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}

}
