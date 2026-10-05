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
        int amt=sc.nextInt();
      System.out.println(coinchange(arr,amt));
    }
    public static int coinchange(int[] arr,int amt)
    {
      if(amt==0)
      {
        return 0;
      }
      Arrays.sort(arr);
      int dp[]=new int[amt+1];
      Arrays.fill(dp,amt+1);
      dp[0]=0;
      for(int i=1;i<dp.length;i++)
        {
          for(int coin:arr)
            {
              if(coin>i)
              {
                break;
              }
              else
              {
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
              }
            }
        }
      return dp[amt]>amt ? -1 : dp[amt];
    }
  }
