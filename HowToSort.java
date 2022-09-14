package Day6;


import java.util.Arrays;

public class HowToSort {
	public static void main(String[] args) {
		int A[] = {32,22,11,14,55};
		Arrays.sort(A);
//		Arrays.sort(A,Collections.reverseOrder());
		System.out.println("Array emements after sorting " );
		{
			System.out.println(Arrays.toString(A));
		}
	}

}
