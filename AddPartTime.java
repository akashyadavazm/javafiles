package employeewagecomputation;

public class AddPartTime {
	
	public static void main(String[] args) {
		int Prsnt_Fl_Tm=1;
		int Prsnt_Pt_Tm=2;
		int Wage_Per_Hours=20;
		//Variables
			int	emphrs=0,empwage=0;
		int empattd=(int)Math.floor(Math.random()*10)%3;
		if(empattd==Prsnt_Fl_Tm)
			emphrs=10;
		else if(empattd==Prsnt_Pt_Tm)
			emphrs=8;
		else
			emphrs=0;
		empwage=emphrs*Wage_Per_Hours;
		System.out.println("Total Employee Wages = "+empwage);		
				
	}
	
}
