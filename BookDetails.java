package Day9;

public class BookDetails {
	
	String fname;
	String lname;
	String adress;
	String city;
	String state;
	int zip;
	long phoneno;
	String email;
	
	public void contact() {
		System.out.println("First Name - " +fname );
		System.out.println("Last Name - " +lname );
		System.out.println("Adress - " +adress );
		System.out.println("City - " +city );
		System.out.println("State - " +state );
		System.out.println("Zip - " +zip );
		System.out.println("Phone No. - " +phoneno );
		System.out.println("Email - " +email );
	}
	public static void main(String[] args) {
		BookDetails book = new BookDetails();
		book.fname = "Akash";
		book.lname = "Yadav";
		book.adress = "Dharti pe";
		book.city = "Azamgarh";
		book.state = "Uttar Pradesh";
		book.zip = 276001;
		book.phoneno = 1234567890;
		book.email = "akashyadavazm@gmail.com";
		
		book.contact();
	}

}
