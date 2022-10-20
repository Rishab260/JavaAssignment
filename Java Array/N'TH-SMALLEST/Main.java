import java.util.*;
import static java.lang.System.out;
class Main {

	public static void main(String[] args)
	{
		int N;
		out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[N];
		
		for(int i = 0;i<N;i++)
	    {
			arr[i] = Integer.parseInt(sc.nextLine());
			
		}
		out.println("enter k:");
		int K = Integer.parseInt(sc.nextLine());
        K = K-1;
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
