package linecomparison;

public class Calculatelength {
	public static void main(String[] args) {
		int x1 =10,y1=14;
		int x2=20,y2=19;
		int length;
		length=(int)Math.sqrt( (x2-x1)*(x2-x1) +(y2-y1)*(y2-y1) );
		System.out.println(length);
	}

}
