package Day6;

public class LeftRotateArray {

	public static void main(String[] args) {
		int A[] = {10,20,30,40,50};
		int B[] = new int[A.length];
		int n=1; //no. of element rotate to left
		System.out.println("Array length is : "+A.length);	
		for(int i=0;i<A.length;i++) {
			
			 if(i<n) {
				 
				B[i]=A[A.length-i-1];
				
				}
			 
			 else
	
				{
					B[i]=A[i-n];
				
				}
		}
		System.out.print("array A is : ");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i] + ", ");	
		}
		{
			System.out.println();		
		}
		System.out.print("Rotated array is : ");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(B[i] + ", ");	
		}
		
	}
	
}