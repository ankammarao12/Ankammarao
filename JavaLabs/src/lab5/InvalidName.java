package lab5;

// Invalid Name Exception Program by using regular Expressions

import java.util.*;
import java.util.regex.*;
import javax.naming.*;

class Customer {
	private String firstname;
	private String lastname;

	public Customer() {// default constructor
	}

	public Customer(String firstname, String lastname) throws InvalidNameException {
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcherf = pattern.matcher(firstname);
		Matcher matcherl = pattern.matcher(lastname);
		if ((firstname.length() < 6) || (lastname.length() < 6) || matcherf.find() || matcherl.find()) {
			throw new InvalidNameException(" ");
		} else {
			this.firstname = firstname;
			this.lastname = lastname;
		}
	}

	public void setFirstName(String firstname) throws InvalidNameException {  //method for First name
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcherf = pattern.matcher(firstname);
		if ((firstname.length() < 6) || matcherf.find()) {
			throw new InvalidNameException(" ");
		} else {
			this.firstname = firstname;
		}
	}

	public void setLastName(String lastname) throws InvalidNameException {  //method for last name
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcherl = pattern.matcher(lastname);
		if ((lastname.length() < 6) || matcherl.find()) {
			throw new InvalidNameException(" ");
		} else {
			this.lastname = lastname;
		}
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	@Override
	public String toString() {  //to string method to overriding
		return ("Name = " + firstname + " " + lastname);
	}
}

public class InvalidName {
	public static void main(String[] args) throws InvalidNameException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name:");

		String first = sc.next();
		
		System.out.println("Enter last Name:");
		
		String last = sc.next();
		Customer c = new Customer();
		c.setFirstName(first);
		c.setLastName(last);
	}
}