package employeewagecomputation;

public class SwitchCase {
	public static void main(String[] args) {
		int prsnt_fl_tm = 1;
		int prsnt_hf_tm = 2;
		int wage_per_hrs = 20;
		//constants
		int emphrs = 0,empwage = 0;
		int empcheck=(int)Math.floor(Math.random()*10)%3;
				switch (empcheck) {
				case 1:
					emphrs=10;
					break;
				case 2:
					emphrs=8;
					break;
				default:
					emphrs=0;
				}
				empwage = emphrs * wage_per_hrs;
				System.out.println( "Employee Wage: "+empwage);
	}
}
				