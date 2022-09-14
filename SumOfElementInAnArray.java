package Day6;

public class SumOfElementInAnArray {
	public static void main(String[] args) {
		int Array[] = {70, 30, 20, 90, 10, 50, 80, 60, 40};
		int Sum=0;
		{
			System.out.print("No.of elements in an array = " +Array.length);
		}
		
		System.out.println();
		
		for (int i=0; i<Array.length;i++)
		{
			Sum+=Array[i];
		
		}
		System.out.print("Sum of all elements of an array is = " +Sum);
	}

}
