package libarian;

import java.util.Scanner;


public class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		bookTypes books[];
		books = new bookTypes[100];

		
		Scanner input = new Scanner(System.in);
	
		int bookNum = 5; // USER CAN CHANGE THE NUMBERS OF BOOKS AND INFOS CAN BE ENTER.
		int memberNum = 2; //USER CAN CHANGE THE NUMBERS OF MEMBERS AND INFOS CAN BE ENTER
		
		
		for (int i = 0; i < bookNum; i++) {
			books[i] = new bookTypes();
			//************ Entering title(s) **************//
			System.out.print("Enter the book title for " );
			System.out.println("Book " + i );
			String title = input.nextLine();
			books[i].setTitle(title); //user enter their titles
			//********************************************//
			
			//************ Entering author(s) *************//
			System.out.println("How many author(s) wrote this book? (maximum 4) ");
			int numAuth = input.nextInt(); //user choice of entering how many authors is in the book
			
			System.out.println("Enter the author(s). ");
			for(int j=0 ; j <=numAuth ; j++) {
				String auth = input.nextLine();
				books[i].setAuthor(auth);
			}
			//********************************************//
			
			//************ Entering publisher *************//
			System.out.print("Enter the book publisher " );
			System.out.println("Publisher " + i );
			String publ = input.nextLine();
			books[i].setPub(publ);
			//********************************************//
			
			books[i].setCopies(getRandomInteger(100, 1)); 
			books[i].setISBN(1231231231 + i * 50);
			books[i].setPrice(100.00 + .99 * i);
			books[i].setYear(getRandomInteger(2019, 1900));

		}
		

		for (int i = 0; i < memberNum; i++) {
			System.out.println("");
			books[i].showTitle();
			books[i].showAuthor();
			books[i].showPub();
			books[i].showYear();
			books[i].showISBN();
			books[i].showCopies();
			books[i].showPrice();
		}
		


		
		
		
		System.out.println("");
		
		
		memberType people[];
		people = new memberType[100];

		for (int i = 0; i < memberNum; i++) {
		
			people[i] = new memberType();
			
			System.out.println("Enter the member's name.  "+ i);
			String personName = input.nextLine();
			people[i].setPerson(personName);
			
			System.out.println("Enter the member's ID. (ex. xxx-xx-xxxx) " +i);
			String personID = input.nextLine();
			people[i].setID(personID);
			
			people[i].setBB( getRandomInteger(10, 1));
			people[i].setSpent( getRandomInteger(10, 1));
			
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("");
			people[i].showName();
			people[i].showID();
			people[i].showBB();
			people[i].showSpent();

		}

	
	
	
	
	
	
	}	
	//************************************************************
	//Name: random int gen
	//pre: getting the class calls from a range of max to min
	//post: with the algorthim shown below it will output a random
	//number from the range of max to min
	//************************************************************
	public static int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}

	
}
