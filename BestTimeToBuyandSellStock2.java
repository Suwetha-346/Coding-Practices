import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println(maxProfit(arr));
	}
static int maxProfit(int arr[])
{
    int total = 0;
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>arr[i-1])
        {
            total += arr[i]-arr[i-1];
        }
    }
    return total;
}

}
