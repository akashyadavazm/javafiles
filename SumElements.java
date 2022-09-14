package Day6;

public class SumElements {
	public static void main(String[] args) {
		int Array[] = {1,3,2,5,2,3,4,6};
		int Sum = 0;
		System.out.println("Sum of element of an array : ");
		for(int i=0;i<Array.length;i++)
		{
			Sum += Array[i];
			
		}
		System.out.println(Sum);
	}
	
}	
