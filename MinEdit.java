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
      System.out.println(minEdit(arr));
    }
    public static int minEdit(int arr[])
    {
      HashSet<Integer> set = new HashSet<>();
      int n=arr.length;
      for(int i=0;i<n;i++)
        {
          if(arr[i]>0)
          {
            set.add(arr[i]);
          }
        }
      for(int i=1;i<=n+1;i++)
        {
          if(!set.contains(i))
          {
            return i;
          }
        }
      return n+1;
    }
  }
