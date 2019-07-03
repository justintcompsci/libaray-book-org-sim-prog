package libarian;

public class memberType {
	
	private String person;
	private String ID;
	private int booksBought;
	private double spent;
	
	//***********************************************************
	//memberType constructor
	//pre: none.
	//post: intialize all variables to 0 and all string to null.
	//***********************************************************
	public memberType(){
		person="";
		ID ="";
		booksBought=0;
		spent = 0.0;
	}
	//////////////////////////////////////////
	public void setPerson(String name) {
		person = name;
	}
	
	public String getPerson() {
		return person;
	}
	//display
	public void showName() {
		System.out.print("Name: ");
		System.out.println(person);
	}
	//////////////////////////////////////////
	
	public void setID(String nums) {
		ID = nums;
	}
	
	public String getID() {
		return ID;
	}
	
	public void showID() {
		System.out.print("ID: ");
		System.out.println(ID);
	}
	//////////////////////////////////////////
	
	public void setBB(int books) {
		booksBought = books;
	}
	
	public int getBB() {
		return booksBought;
	}
	
	public void showBB() {
		System.out.print("Books bought: ");
		System.out.println(booksBought);
	}
	//////////////////////////////////////////
	
	public void setSpent(int spend) {
		spent = spend;
	}
	
	public double getSpent() {
		return spent;
	}
	
	public void showSpent() {
		System.out.print("Spent: $");
		System.out.println(spent);
	
	}

}
