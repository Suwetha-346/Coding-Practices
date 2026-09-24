import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextInt(); 
		}
		long res=MinSubK(n,k,a);
		System.out.println(res);
	}
  public static long MinSubK(int n,int k,int a[])
  {
    long curr=0;
    for(int i=0;i<k;i++)
      {
        curr+=a[i];
      }
    long min_s=curr;
    for(int i=k;i<n;i++)
      {
        curr+=a[i]-a[i-k];
        if(curr<min_s)
        {
          min_s=curr;
        }
      }
    return min_s;
  }
}
    
