package cs235.quiz6;
import java.util.*;
public class SortingBooks {
	public static void main(String[] args){
		Book book1 = new Book (969608, "Database Systems: Desigh, Implementation, and Management","Cengage Learning"),
			 book2 = new Book (128718, "An Introduction to Programming and Object Oriented Design using Java", "Wiley"),
			 book3 = new Book (530532, "Java Programming From Problem Analysis to Program Design","Cengage Learning");
		List<Book> bookShelf = Arrays.asList(book1,book2,book3);
		for(Book i:bookShelf) System.out.println(i);
		System.out.println();
		Collections.sort(bookShelf);
		for(Book i:bookShelf) System.out.println(i);
		System.out.println();
		Collections.sort(bookShelf,Book.TitleComparator);
		for(Book i:bookShelf) System.out.println(i);
		System.out.println();
		Collections.sort(bookShelf,Book.PublisherTitleComparator);
		for(Book i:bookShelf) System.out.println(i);
		System.out.println();
	}
}
