import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println(LSSumK(a,n,k));
    }
    public static int LSSumK(int a[],int n,int k)
    {
      HashMap<Integer,Integer> mp=new HashMap<>();
      int sum=0;
      int maxLen=0;
      for(int i=0;i<n;i++)
        {
          sum+=a[i];
        if(sum==k)
        {
          maxLen=i+1;
        }
        if(mp.containsKey(sum-k))
        {
          int len=i-mp.get(sum-k);
          maxLen=Math.max(len,maxLen);
        }
        if(!mp.containsKey(sum))
        {
          mp.put(sum,i);
        }
        }
      return maxLen;
    }
  }
