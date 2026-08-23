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
      System.out.println(buysell(arr));
    }
    public static int buysell(int[] arr)
    {
      int max=0;
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              int profit=arr[j]-arr[i];
              max=Math.max(max,profit);
            }
        }
      return max;
    }
  }
