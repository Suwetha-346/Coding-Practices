import java.io.*;
import java.util.*;
public class Main
  {
    public static int main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      Arrays.sort(a);
      int l=0;
      int r=1;
      while(r<n)
        {
          if(l==r)
          {
            r++;
            continue;
          }
          int d=a[r]-a[l];
          if(d==t)
          {
            return 1;
          }
          else if(d<t)
          {
            r++;
          }
          else
          {
            l++;
          }
        }
      return 0;
    }
  }
          
      
