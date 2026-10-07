import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      System.out.println(minEdit(s1,s2));
    }
    public static int minEdit(String s1,String s2)
    {
      int m=s1.length();
      int n=s2.length();
      int dp[][]=new int[m][n];
      for(int j=0;j<=n;j++)
        {
          dp[0][j]=j;
        }
      for(int i=0;i<=m;i++)
        {
          dp[i][0]=i;
        }
      for(int i=1;i<=m;i++)
        {
          for(int j=1;j<=n;j++)
            {
              if(s1.charAt(i-1)==s2.charAt(j-1))
              {
                dp[i][j]=dp[i-1][j-1];
              }
              else
              {
                dp[i][j]=1 + Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
              }
            }
        }
      return dp[m][n];
    }
  }
