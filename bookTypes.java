package libarian;

public class bookTypes {

	private String title;
	private String[] authors;
	private String publisher;
	private int ISBN;
	private double price;
	private int copies;
	private int authorsNum;
	private int year; 
	
	//***********************************************************
	//bookType constructor
	//pre: none.
	//post: intialize all variables to 0 and all string to null.
	//***********************************************************
	public bookTypes() {
		title = "";
		copies = 0;
		price = 0;
		authorsNum = 0;
		ISBN = 0;
		authors = new String []{"","","",""};
		publisher = "";
		year = 0;
	}

	//setter for title
	public void setTitle(String myTitle) {
		title = myTitle;
	}
	//getter for title
	public String getTitle() {
		return title;
	}

	
	
	
	
	
	//intialize author numbers = 0
	public void clearAuthors() {
		authorsNum = 0;
	}
	//setter for author
	public void setAuthor(String myAuthor) {
		if (authorsNum < 4) {
			authors[authorsNum] = myAuthor;
			authorsNum++; //loops in how many authors thr user called
		}
	}
	//getter for author
	public String getAuthor(int num) {
		if (authorsNum < num) {
			return authors[num - 1];
		} else
			return "";
	}

	
	
	
	
	

	//setter for ISBN
	public void setISBN(int myISBN) {
		ISBN = myISBN;
	}
	//getter for ISBN
	public int getISBN() {
		return ISBN;
	}
	
	
	
	
	

	//setter for publisher
	public void setPub(String myPub) {
		publisher = myPub;
	}
	//getter for publisher
	public String getPub() {
		return publisher;
	}
	
	
	
	

	//setter for years
	public void setYear(int num) {
		year = num;
	}
	//getter for years
	public int getYear() {
		return year;
	}
	
	
	

	//setter for copies 
	public void setCopies(int num) {
		if (num >= 0) //check for negative copies
			copies = num;
	}
	//getter for copies
	public int getCopies() {
		return copies;
	}
	

	
	
	
	

	//setter for price
	public void setPrice(double num) {
		if (num >= 0)// check for user input neg $$$
			price = num;
	}
	//getter for price
	public double getPrice() {
		return price;
	}
	
	
	
	
	
	
	
	
	//*************Displays ******************//
	public void showTitle() {
		System.out.print("Title: ");
		System.out.println(title);
	}

	public void showAuthor() {
		System.out.print("Author(s): ");
		System.out.println(authorsNum-1);

		for (int i = 0; i < authorsNum; i++) {
			System.out.println(authors[i]);
		}
		System.out.println(" ");
	}

	public void showPub() {
		System.out.print("Publisher: ");
		System.out.println(publisher);
	}

	public void showYear() {
		System.out.print("Year of Publication: ");
		System.out.println(year);
	}

	public void showISBN() {
		System.out.print("ISBN: ");
		System.out.println(ISBN);
	}

	public void showCopies() {
		System.out.print("Copies Avaliable: ");
		System.out.println(copies);
	}

	public void showPrice() {
		System.out.print("Price: ");
		System.out.println(price);
	}

	public boolean compareTitle(String myTitle) {
		return (title == myTitle);
	}

}
