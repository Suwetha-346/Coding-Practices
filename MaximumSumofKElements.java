import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int s=0;
      for(int j=0;j<k;j++)
        {
          s+=arr[i];
        }
      int max=0;
      max=Math.max(s,max);
      for(int i=k;i<n;i++)
        {
          s=s-arr[i-k]+arr[i];
          max=Math.max(s,max);
        }
      System.out.println(max);
    }
  }
          
