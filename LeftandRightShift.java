import java.io.*;
import java.util.*;
public class Main()
{
  public static void main(String args[])]
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=sc.nextInt();
    int r=sc.nextInt();
    n=n*2^l; // n=n<<l
    n=n/2^r; // n=n>>r
    System.out.println(n);
  }
}
