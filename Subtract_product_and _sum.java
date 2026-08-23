import java.util.*;
import java.io.*;
class Main{
public static void main(String args[])
  {
  Scanner sc =new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(prodSum(n));
 }
 static int prodSum(int n)
  {
    int prod = 1;
    int sum = 0;
    while(n>0)
      {
        int d = n % 10;
        prod *= d;
        sum += d;
        n = n/10;
      }
    return prod - sum;
  }
}
