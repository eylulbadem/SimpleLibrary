import java.util.Scanner;

/**
 * Lab07b
 * @author Eylul Badem
 * @version 13.12.2020
*/ 

public class LibraryBook {

    // properties
    
    String	title;
    String author;
    String dueDate;
    int	timesLoaned;
    
    // constructors
    
    public LibraryBook( String theTitle, String theAuthor, String theDueDate, int thetimesLoaned ) {
        title = theTitle;
        author = theAuthor;
        dueDate = theDueDate;
        timesLoaned = thetimesLoaned;
    }
    
    Scanner scan = new Scanner(System.in);

    // methods
    
    // Have methods to get the book's values
    public String getTitle() { 
        return title;
    }
    
    public String getAuthor() { 
        return author;
    }
    
    public String getDueDate() { 
        return dueDate;
    }

    public int getTimesLoaned() {
        return timesLoaned;
    }
    
    // Have a method to set the due date as the librarian wishes
    public void setDueDate( String someText) { 
        dueDate = someText;
    }
    
    // Have a method to add 1 to the total number of borrowing for that book
    public void increaseTimesLoaned() { 
        timesLoaned = timesLoaned + 1;
    }

    // Have a method to check if the book is borrowed or not
    public boolean onLoan() {
        boolean result;
        
        if ( onLoan())
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    
    // Have a method to borrow the wanted book and set the values as that book's values
    public void loan(LibraryBook book)
    {
        book.setDueDate("22.01.2021");
        String bookTitle = book.getTitle();
        String author = book.getAuthor();
        String dueDate = book.getDueDate();
        book.increaseTimesLoaned();
        int timesLoaned = book.getTimesLoaned();
            
        // Print out the information to let the user know
        System.out.println( "Borrowing succesful!");
        System.out.println( "You borrowed: " + bookTitle);
        System.out.println( "By: " + author);
        System.out.println( "Due Date: " + dueDate);
        System.out.println( "Total borrowing: " + timesLoaned);
    }
    
    // Have a method to return the wanted book
    public void returnBook(LibraryBook book)
    {
        timesLoaned = timesLoaned - 1;
    }
    
    public String toString() {
        return title + "";
    }
}
