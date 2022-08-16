package employeewagecomputation;

public class DailyEmployeeWages {
	public static void main(String[] args) {
		int Present=1;
		int Wage_Per_Hours=20;
		int emphrs=0;
		int empwage=0;
		double empattendance=Math.floor(Math.random()*10)%2;
		if(empattendance==Present)
			emphrs=8;
		else
			emphrs=0;
		empwage=emphrs*Wage_Per_Hours;
		System.out.println("Employee Wage = " +empwage);
	}

}
