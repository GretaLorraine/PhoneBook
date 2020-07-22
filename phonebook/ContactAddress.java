package com.phonebook;

public class ContactAddress {
	
		//define variables
		private String streetName;
		private String city;
		private String state;
		private String zipCode;
		
			
		//constructor method 
		public ContactAddress(String streetName, String city, String state, String zipCode) {
				
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;			
		}

		//getters and setters
		//Street Name
		public String getStreetName() {
			return this.streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		//City
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}	
		//State
		public String getState() {
			return this.state;
		}
		public void setState(String state) {
			this.state = state;
		}	
		//Zipcode
		public String getZipCode() {
			return this.zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
			
			
		public String formatAddress() {
			return this.streetName + ", " + this.city + ", " + this.state + ", " + this.zipCode;
		}
		

		
}
