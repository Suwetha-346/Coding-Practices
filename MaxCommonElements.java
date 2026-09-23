import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int j=0;j<n;j++)
        {
          b[j]=sc.nextInt();
        }
      int i=0;
      int j=0;
      Arrays.sort(a);
      Arrays.sort(b);
      int c=0;
      while(i<n && j<n)
        {
          if(a[i]==b[j])
          {
            c++;
            i++;
            j++;
          }
          else if(a[i]<b[j])
          {
            i++;
          }
          else
          {
            j++;
          }
        }
    System.out.println(c);
    }
  }
          
      
      
