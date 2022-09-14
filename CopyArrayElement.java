package Day6;

public class CopyArrayElement {

	public static void main(String[] args) {
		
		int ArrayA[] ={9,8,7,6,5,4,3,2,1,0};
		int ArrayB[] = new int[ArrayA.length];
		
		System.out.print("Elements of ArrayA is : ");
		for(int i=0;i<ArrayA.length;i++) {

		ArrayB[i]=ArrayA[i];
                              
		System.out.print(ArrayA[i]+ ", ");
	}
		System.out.println();
		
		//Display element of ArrayB
	System.out.print("Copied Element of ArrayA in ArrayB is : ");
			
		for(int i=0;i<ArrayA.length;i++) {
			ArrayB[i]=ArrayA[i];
			
			System.out.print(ArrayB[i]+ ", ");
			
		}
		
    }	

}