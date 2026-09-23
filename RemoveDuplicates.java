import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.m=nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      Arrays.sort(arr);
      int s=0;
      int f=1;
      while(f<arr.length)
        {
          if(arr[s]!=arr[f])
          {
            s++;
            a[s]=a[f];
          }
          f++;
        }
      System.out.println(s+1);
      for(int j=0;j<=s;j++)
        {
          System.out.println(a[j]+" ");
        }
    }
  }
      
