import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(trap(arr,n));
    }
    public static int trap(int[] arr,int n)
    {
      int l=0;
      int r=arr.length-1;
      int l_max=0;
      int r_max=0;
      int wt=0;
      while(l<r)
        {
          if(arr[l]<=arr[r])
          {
            l_max=Math.max(l_max,arr[l]);
            wt += l_max - arr[l];
            l++;
          }
          else
          {
            r_max=Math.max(r_max,arr[r]);
            wt += r_max - arr[r];
            r--;
          }
        }
      return wt;
    }
  }
