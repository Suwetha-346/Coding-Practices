import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(pro(arr));
    }
    public static int[] pro(int[] arr)
    {
      int n=arr.length;
      int ans[] = new int[n];
      ans[0]=1;
     for(int i=1;i<n;i++)
       {
         ans[i]=ans[i-1]*arr[i-1];
       }
      int rightpro=1;
      for(int i=n-1;i>=0;i--)
        {
          ans[i]=ans[i]*rightpro;
          rightpro=rightpro*arr[i];
        }
      return ans;
    }
  }
