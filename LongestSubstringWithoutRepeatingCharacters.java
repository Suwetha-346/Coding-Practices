import java.io.*;
import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String S=sc.next();
      int res=ls(S);
      System.out.println(res);
    }
    public static int ls(String S)
    {
      HashSet<Character> hs=new HashSet<>();
      int l=0;
      int max=0;
      for(int r=0;r<S.length();r++)
        {
          char ch=S.charAt(r);
          while(hs.contains(S.charAt(r)))
          {
            hs.remove(S.charAt(l));
            l++;
          }
          hs.add(ch);
          int curr=r-l+1;
          max=Math.max(curr,max);
        }
      return max;
    }
  }
    
