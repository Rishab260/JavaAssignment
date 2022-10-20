import java.util.*;

class Main {

	public static void removeDuplicates(int[] arr)
	{
		LinkedHashSet<Integer> set
			= new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			set.add(arr[i]);

		System.out.print(set);
	}

	
	public static void main(String[] args)
	{  
	    Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int arr[] = new int[N];
	    for(int i = 0; i< N;i++)
		{
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		removeDuplicates(arr);
	}
}
