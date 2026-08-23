import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(climb(n));
    }
    public static int climb(int n)
    {
      int dp[] = new int[n+2];
      dp[0]=0;
      dp[1]=1;
      for(int i=2;i<dp.length;i++)
        {
          dp[i]=dp[i-1]+dp[i-2];
        }
      return dp[n+1];
    }
  }
