import java.util.*;

class Main {

	public static void main(String[] args)
	{
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		N = Integer.parseInt(sc.nextLine());
		int[] arr = new int[N];
		for (int i = 0; i<N;i++)
		{
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter K:");
		
		int K = Integer.parseInt(sc.nextLine());

		
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < N; i++)
			s.add(arr[i]);
		Iterator<Integer> itr = s.iterator();

		while (K > 0) {
			itr.next();
			K--;
		} 

		System.out.println(itr.next());
	}
}
