import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(jump(arr));
    }
    public static boolean jump(int[] arr)
    {
      int max=0;
      for(int i=0;i<arr.length;i++)
        {
          if(i>max)
          {
            return false;
          }
          max=Math.max(max,i+arr[i]);
        }
      return true;
    }
  }
