package employeewagecomputation;

public class EmployeesAttendance {
	public static void main(String[] args) {
		int Present = 1;
	    double empattd = Math.floor(Math.random() * 10 ) % 2;
		if(empattd==Present)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");
	}
}