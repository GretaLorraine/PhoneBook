package com.phonebook;

import java.util.Scanner;

public class Menu {


//	Test case :
//		John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
//		John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
//		John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
		
	
	static Scanner myScanner = new Scanner(System.in);

	public static void menuStart() {

		boolean done = false;
		int userChoice = 0;

		while (done == false) {

			System.out.println("Welcome! Please select a number:");
			System.out.println("1 Add a new entry");
			System.out.println("2 Search by first name");
			System.out.println("3 Search by last name");
			System.out.println("4 Search by full name");
			System.out.println("5 Search by telephone number");
			System.out.println("6 Search by city: ");
			System.out.println("7 Delete a record");
			System.out.println("8 Update a record");
			System.out.println("9 Show all records");
			System.out.println("10 Exit");

			String choice = myScanner.nextLine();
			try {
				userChoice = Integer.parseInt(choice);
			} catch (Exception e) {
				System.out.println("Invalid Input!");
				menuStart();
			}

		//new entry
			if (userChoice == 1) {
				System.out.println("Enter new contact: ");
				String userInput = myScanner.nextLine();
				Storage.addNewEntry(userInput);
			}
			
		//search by first name
			if (userChoice == 2) {
				System.out.println("Enter first name of contact to search for: ");
				String firstname = myScanner.nextLine();
				Storage.searchByFirstName(firstname);
			}
			
		//search by last name
			if (userChoice == 3) {
				System.out.println("Enter last name of contact to search for: ");
				String lastname = myScanner.nextLine();
				Storage.searchByLastName(lastname);
			}
			
		//search by full name
			if (userChoice == 4) {
				System.out.println("Enter full name of contact to search for: ");
				String fullname = myScanner.nextLine();
				Storage.searchByFullName(fullname);
			}
			
		//search by telephone number
			if (userChoice == 5) {
				System.out.println("Enter telephone number of contact to search for: ");
				String telephone = myScanner.nextLine();
				System.out.println(Storage.searchByPhone(telephone));
			}
			
		//search by city
			if (userChoice == 6) {
				System.out.println("Enter city of contact to search: ");
				String city = myScanner.nextLine();
				Storage.searchByCity(city);
			}
			
		//delete a record
			if (userChoice == 7) {
				System.out.println("Enter telephone of contact you would like to delete: ");
				String userInput = myScanner.nextLine();
				Storage.deleteRecord(userInput);
			}
			
//		//update contact
//			if (userChoice == 8) {
//				System.out.println("Enter telephone of contact to update: ");
//				String numbers = myScanner.nextLine();
//				Storage.updateRecord(numbers);
//			}
			
		//print saved contact list in asc order
			if (userChoice == 9) {
				Storage.sortContactFullName(Storage.savedContactArray);
				Storage.printSavedContacts(Storage.savedContactArray);
			}
			
		//exit application
			if (userChoice == 10) {
				done = true;
				System.out.println("Goodbye!");
			}
		}

	}

}
