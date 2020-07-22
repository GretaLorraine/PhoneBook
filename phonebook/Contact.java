package com.phonebook;

import java.util.Scanner;

public class Contact {

	static Scanner myScanner = new Scanner(System.in);
	
	//variables for Contact class
	private String fullName;
	private String firstName;
	private String lastName;
	private ContactAddress address;
	private String telephone;
	
	public Contact() {}
	
	//constructor with parameters
	public Contact(String firstName, String fullName, String lastName, ContactAddress address, String telephone) {
		this.firstName = firstName;
		this.fullName = fullName;
		this.lastName = lastName;
		this.address = address;
		this.telephone = telephone;
	}
	
	//constructor for full name search
	public Contact(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//string together contact info
	public String toString() {
		return this.fullName + ", " + this.address.formatAddress() + " " + this.formatTelephone();
	}
	
	//display telephone with area code separated
	public String formatTelephone() {
		return "(" + telephone.substring(1, 4) + ") " + telephone.substring(4, 7) + "-" + telephone.substring(7);
	}
	
	
	//Full name
		public String getFullName() {
			return this.fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		
	//First name
		public String getFirstName() {
			return this.firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	//last name
		public String getLastName() {
			return this.lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	//address
		public ContactAddress getAddress() {
			return this.address;
		}
		public void setAddress(ContactAddress address) {
			this.address = address;
		}
	//telephone
		public String getTelephone() {
			return this.telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String compareToIgnoreCase(Contact contact) {
			return contact.toString();
		}
	
		
		
}
