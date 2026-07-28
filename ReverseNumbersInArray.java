import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  revnum(arr,n);
}
  static void revnum(int arr[],int n)
  {
    for(int i=0;i<n;i++)
    {
        int org = arr[i];
        int rev = 0;
        while(org!=0)
        {
            int d = org % 10;
            rev = (rev * 10)+d;
            org = org /10;
        }
        arr[i]=rev;
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
  }
}

