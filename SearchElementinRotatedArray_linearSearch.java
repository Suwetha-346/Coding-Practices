import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int target=sc.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(findelement(arr,target));
    }
    public static int findelement(int[] arr,int target)
    {
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==target)
          {
            return i;
          }
        }
      return -1;
    }
  }
