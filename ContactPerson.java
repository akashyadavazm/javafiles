package Day9;

import java.util.*;

class ContactBook {

	String fname, lname, adress, city, state;
	int zip;
	long phoneno;
	String email;

	public ContactBook(String fname, String lname, String adress, String city, String state, int zip, long phoneno, String email) {

		this.fname = fname;

		this.lname = lname;

		this.adress = adress;

		this.city = city;

		this.state = state;

		this.zip = zip;

		this.phoneno = phoneno;

		this.email = email;
	}

	public class ContactPerson {
		
		public static void main(String[] args) {

			ArrayList<ContactBook> book = new ArrayList<ContactBook>();

			ContactBook b = new ContactBook("Virat", "Kohli", "Rajpath", "South Delhi", "New Delhi", 723236, 378923121,
					"viratghxgf@gmail.com");
			
			book.add(b);

			for (ContactBook c: book) {
				System.out.println(c.fname + " " + c.lname + " " + c.adress + " " + c.city + " " + c.state + " " + c.zip
						+ " " + c.phoneno + " " + c.email);

			}
		}
	}

}