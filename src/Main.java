import java.util.List;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
        //Predicate<Book> myLambda = book -> book.getTitle().toLowerCase().contains("men");
		
		// Passing the the lambda directly in to the function
		List<Book> foundBooks = bc.findBooks(book -> book.getTitle().toLowerCase().contains("men"));
	
		for (Book nextBook : foundBooks) {
			System.out.println (nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
	}
}
