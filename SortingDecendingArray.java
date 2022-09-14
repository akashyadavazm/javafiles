package Day6;

public class SortingDecendingArray {
	public static void main(String[] args) {
		int A[] = {32,22,11,14,55};
		int sort = 0;
		System.out.println("Array in Decending Order ");
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
				if(A[j]>A[i])
				{
					sort=A[i];
					A[i]=A[j];
					A[j]=sort;
				}
		}
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+ " ");
	}

}
