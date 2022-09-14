package Day9;

import java.util.*;

class ContactList {

	String fname, lname, adress, city, state;
	int zip;
	long phoneno;
	String email;

	public ContactList(String fname, String lname, String adress, String city, String state, int zip, long phoneno,
			String email) {

		this.fname = fname;

		this.lname = lname;

		this.adress = adress;

		this.city = city;

		this.state = state;

		this.zip = zip;

		this.phoneno = phoneno;

		this.email = email;
	}

}

public class EditContact {
	public static void main(String[] args) {
		
		ArrayList<ContactList> list = new ArrayList<ContactList>();
		
		ContactList c1 = new ContactList("Akash", "Yadav", "R.T.O Office", "Azamgarh", "Uttar Pradesh", 276001,
				811271203, "akashyadavazm@gmail.com");
		
		ContactList c2 = new ContactList("Rahul", "Rana", "Bhilwada", "kota", "Rajasthan", 278461,
				772972121, "ranarahul@gmail.com");
		
		ContactList c3 = new ContactList("Sudheer", "sangle", "Gaya", "Bodh Gaya", "Bihar", 278233,
				897399178, "sudherersangle@gmail.com");

		list.add(c1);
		list.add(c2);
		list.add(c3);
		
//		Edited Contact Of ContactList 1
		
		c1.phoneno = 62736872;	
		 System.out.println(list.indexOf(c3));
		

		for (ContactList c : list) {
			System.out.println(c.fname + " " + c.lname + ", " + c.adress + ", " + c.city + ", " + c.state + ", " + c.zip
					+ ", " + c.phoneno + ", " + c.email);
			System.out.println();
		}
	}
}
