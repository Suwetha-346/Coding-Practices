import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int target=sc.nextInt();
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println(findele(arr,target));
  }
  public static int findele(int[] arr,int target)
  {
   int l = 0;
   int r = arr.length-1;
   while(l<=r)
     {
       int mid=l+(r-l)/2;
       if(arr[mid]==target)
       {
         return mid;
       }
       if(arr[l]<=arr[mid])
       {
         if(arr[l]<=target && target<arr[mid])
         {
           r=mid-1;
         }
         else
         {
           l=mid+1;
         }
       }
       else
       {
         if(arr[mid]<target && target<=arr[r])
         {
           l=mid+1;
         }
         else
         {
           r=mid-1;
         }
       }
     }
    return -1;       
  }
}
