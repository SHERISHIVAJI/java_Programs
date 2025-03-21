/*
Create a Book class with bookId, bookName and authorName.Create parameterized  
constructor to initialize the object. Create an ArrayList of type Book and store
all book objects into collections and display all book details.
[Hint:Use advanced for loop to display all Books details]
*/
package ajp.lab9;

import java.util.ArrayList;


//Book class definition
class Book {
	//Instance variables
	private int bookId;
	private String bookName;
	private String authorName;
	
	//Parameterized constructer to initialize the object
	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	//Method to display book details
	public void displayBookdetails() {
		System.out.println("Book ID: "+bookId);
		System.out.println("Book Name: "+bookName);
		System.out.println("Auther Name: "+authorName);
	}
}
public class BookCollection {
	public static void main(String[] args) {
		//Creating an ArrayList to store Book object
		ArrayList<Book> bookList = new ArrayList<>();
		
		//Adding some book objects to the ArrayList
		bookList.add(new Book(1, "Java Programming","John Doe"));
		bookList.add(new Book(2, "Data Structures", "Jane Smith"));
		bookList.add(new Book(3, "Design Patterns","Robert Martin"));
		bookList.add(new Book(4, "Effective Java","Joshua Bloch"));
		
		//Using an advanced for loop to display all book details
		for(Book book:bookList) {
			System.out.println("\n************************************\n");
			book.displayBookdetails();
			System.out.println("\n************************************\n");

		}
	}
}
