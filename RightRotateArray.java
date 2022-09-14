package Day6;

public class RightRotateArray {
	public static void main(String[] args) {
		int A[] = {10,20,30,40,50};
		int B[] = new int[A.length];
		int n=2; //no. of element rotate to left
		System.out.println("Array length is : "+A.length);	
		for(int i=0;i<A.length;i++) 
		{
			
			 if(i<A.length-n)
			 	{
				 B[i]=A[n+i]; 
			 	}
			 else
			 	{
				 B[i]=A[(n+i)-A.length];	
			 	}
			 System.out.println(B[i]);
		}
			 
	}
	
}