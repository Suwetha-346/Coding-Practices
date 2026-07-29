import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println(repeat(arr));
	}
	static int repeat(int arr[])
	{
	    int n=arr.length;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]==arr[j])
	            {
	                return i+1;
	            }
	        }
	    }
	    return -1;
	}
}
