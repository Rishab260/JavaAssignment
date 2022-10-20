import java.util.*;
import static java.lang.System.out;
class Main
{
	public static void main(String[] idontcare)
	{
		out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++)
	    {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		out.printf("\nEven:");
		for(int i =0;i<n;i++)
		{
			if(arr[i]%2 == 0)
			{
				out.printf("%d ",arr[i]);
			}
		}
		out.printf("\nOdd:");
		for(int i = 0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				out.printf("%d ",arr[i]);
	        }    
		
		}
		
}}