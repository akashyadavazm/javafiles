package Day6;

public class OddOrEvenElement {
	public static void main(String[] args) {
		int A[] = {32,22,11,14,55};
		for (int i=0;i<A.length;i++)
		{
			if(A[i]%2==0)
			{
				System.out.println("Even Elements of an array is : " +A[i]);
			}else
			{
				System.out.println("Odd Elements of an array is : " +A[i]);
			}
		}
	}

}
