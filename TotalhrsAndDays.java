package employeewagecomputation;

public class TotalhrsAndDays {
	public static void main(String[] args) {
		int prsnt_fl_tm = 1;
		int prsnt_hf_tm = 2;
		int num_of_working_days = 20;
		int total_working_hrs = 100;
		int wage_per_hrs = 20;
		//constants
		int totalhrs=0,emphrs=0,totalworkingdays=0;
		while (totalhrs<=total_working_hrs && totalworkingdays<num_of_working_days) {
			totalworkingdays++;
		int empcheck = (int)Math.floor(Math.random()*10)%3;
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
		totalhrs+=emphrs;
		System.out.println("Days: "+totalworkingdays + " Total working Hrs: "+totalhrs);
		}
		int TotalEmpWage=totalhrs * wage_per_hrs;
		System.out.println("Total Wages: " +TotalEmpWage);
	}

}
