package Day6;

public class ThirdLargestNumber {
	public static int ThirdLargest(int A[], int Bound) {
		int temp = 0;
		for(int i=0; i<Bound;i++)
		{
			for(int j=0; j<Bound;j++)
			{
				if(A[i]>A[j])
				{
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return A[Bound - 3];
	}
public static void main(String[] args) {
	int A[] = {32,22,11,14,55};
	System.out.println("Third largest no. is "+ThirdLargest(A, 5));
	}
}	
