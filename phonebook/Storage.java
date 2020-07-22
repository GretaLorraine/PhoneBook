package com.phonebook;

import java.util.Scanner;


public class Storage {
	static Scanner myScanner = new Scanner(System.in);
	

//storage array for saved contacts
	static Contact[] savedContactArray = new Contact[0];
	
//method to add contact to storage array
	public static void addToContactArray(Contact newContact) {
		savedContactArray = addContact(newContact, savedContactArray);
	}
	
//method to add a space in storage
	public static Contact[] addContact(Contact newContact, Contact[] array) {
		Contact[] temp = new Contact[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[temp.length - 1] = newContact;
		return temp;
	}
	
//method to sort ascending using full name
//	public static void sortContactFullName(Contact[] savedContactArray, int k) {
//		Contact temp = new Contact();
//		k = 0;
//		for (int i = 0; i < savedContactArray.length - 1; i++) {
//			for (int j = i + 1; j <savedContactArray.length; j++) {
//				if (savedContactArray[i].getFullName().compareToIgnoreCase(savedContactArray[j])) {//ascending sort
//					temp = savedContactArray[i];
//					savedContactArray[i] = savedContactArray[j];//swapping
//					savedContactArray[j] = temp;
//				}
//			}
//		}
//	}
	
//method to sort contacts in asc order
//	public static void sortContacts(Contact[] savedContactArray) {
//		Contact temp = new Contact();
//		for (int i = 0; i < savedContactArray.length - 1; i++) {
//			for (int j = i + 1; j <savedContactArray.length; j++) {
//				if (savedContactArray[i].compareToIgnoreCase(savedContactArray[j] > 0)) {//ascending sort
//					temp = savedContactArray[i];
//					savedContactArray[i] = savedContactArray[j];//swapping
//					savedContactArray[j] = temp;
//				}
//			}
//		}
//	}
	
//method for 1: add entry
	public static void addNewEntry(String userInput) {
		
		
		//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
		//John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
		//John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
		
		String[] contactArray = userInput.split(",");
		String street = contactArray[1];
		String city = contactArray[2];
		String state = contactArray[3];
		String zip = contactArray[4];
		
		String[] fullnameArray = contactArray [0].split(" ");
		String fullname = contactArray[0];
		String firstname = fullnameArray[0];
		String lastname = fullnameArray[fullnameArray.length - 1];
		String telephone = contactArray[5];
		
		ContactAddress newAddress = new ContactAddress(street, city, state, zip);
		Contact newContact = new Contact(firstname, fullname, lastname, newAddress, telephone);
		
		addToContactArray(newContact);
		}
	
//method for 2: search by first
	public static void searchByFirstName(String firstname) {
		Contact[] temp = new Contact[0];
		for (Contact contact: savedContactArray) {
			if (contact.getFirstName().trim().equalsIgnoreCase(firstname)) {
				temp = addContact(contact, temp);
			}
		}
		for (Contact contact: temp) {
			System.out.println(contact);
		}
	}
	
//method for 3: search by last
	public static void searchByLastName(String lastname) {
		Contact[] temp = new Contact[0];
		for (Contact contact: savedContactArray) {
			if (contact.getLastName().trim().equalsIgnoreCase(lastname)) {
				temp = addContact(contact, temp);
			}
		}
		for (Contact contact: temp) {
			System.out.println(contact);
		}
	}
	
	
//method for 4: search by full
	public static void searchByFullName(String fullname) {
		Contact[] temp = new Contact[0];
		for (Contact contact: savedContactArray) {
			if (contact.getFullName().trim().equalsIgnoreCase(fullname)) {
				temp = addContact(contact, temp);
			}
		}
		for (Contact contact: temp) {
			System.out.println(contact);
		}
	}

	
//method for 5: search by telephone
	public static Contact searchByPhone(String telephone) {
		for(Contact contact: savedContactArray) {
			if(contact.getTelephone().trim().equalsIgnoreCase(telephone)) { //trim!!!
				return contact;
			}
		}
		return null;
	}
	
//method for 6: search by city
	public static Contact searchByCity(String city) {
		for (Contact contact: savedContactArray) {
			if (contact.getAddress().getCity().trim().equalsIgnoreCase(city)) {
				return contact;
			}
		}
		return null;
	}
	
//method for 7: delete a record
	public static void deleteRecord(String userInput) {
		for(int i = 0; i < savedContactArray.length; i++) {
			if (savedContactArray[i].getTelephone().trim().equals(userInput)) {
				savedContactArray[i] = null;
				break;
			}
		}
	}
	
	
//method for 8: update a record
//	public static void updateRecord(String numbers) {
//		System.out.println(Storage.searchByPhone(numbers));
//		
//		System.out.println("What would you like to update?");
//		System.out.println("1 Contact name: ");
//		System.out.println("2 Contact address: ");
//		System.out.println("3 Contact telephone: ");
//		int userInput = myScanner.nextInt();
//		if (userInput == 1) {
//			System.out.println("Change name to: ");
//			String name = myScanner.nextLine();
//			
//		}
//	}
	
	
//method for 9: show record of contacts saved in asc order
	public static void printSavedContacts(Contact[] savedContactArray) {
		for (Contact contact: savedContactArray) {
			System.out.println(contact);
		}
	}
}



	//static is part of the class- ex. 
	//static changes responsibility to class itself, otherwise stored in object
	//make static when you don't want to call an object	

//public static Entry[] deleteEntry(Entry entry) {
//	Entry[] temp = new Entry[0];
//for(int i = 0; i < entryList.length; i ++) {
//	if (entryList[i].equals(entry)) {
//		temp = addToArray(entryList[i], temp);
//	}
//} return temp;
//}


