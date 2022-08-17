package employeewagecomputation;

public class WagesForMonth {
	public static void main(String[] args) {
		int prsnt_fl_tm = 1;
		int prsnt_hf_tm = 2;
		int wage_per_hrs = 20;
		int num_of_working_days=20;
		//constants
		int emphrs = 0,empwage = 0,totalempwage = 0;
		for(int day=0;day<num_of_working_days;day++) {
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
				totalempwage+=empwage;
				System.out.println( "Employee Wage: "+empwage);
		}
		System.out.println(" Total Employee Wages: "+totalempwage);
	}
}
