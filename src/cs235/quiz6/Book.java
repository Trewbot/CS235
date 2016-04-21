package cs235.quiz6;
import java.util.Comparator;
public class Book implements Comparable<Book>{
	private long isbn;
	private String title,publisher;
	public Book(long isbn, String title, String publisher){
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
	}
	public long getIsbn(){return isbn;}
	public String getTitle(){return title;}
	public String getPublisher(){return publisher;}
	public String toString(){return "***ISBN: " + isbn + "\n Title: " + title + "\n Publisher: " + publisher;}
	@Override public int compareTo(Book o){
		if(this.isbn > o.isbn) return 1;
		else if(this.isbn < o.isbn) return -1;
		else return 0;
	}
	public static Comparator<Book> TitleComparator = new Comparator<Book>(){
		@Override public int compare(Book arg0, Book arg1){return arg0.title.compareTo(arg1.title);}
	};
	public static Comparator<Book> PublisherComparator = new Comparator<Book>(){
		@Override public int compare(Book arg0, Book arg1){return arg0.publisher.compareTo(arg1.publisher);}
	};
	public static Comparator<Book> PublisherTitleComparator = new Comparator<Book>(){
		@Override public int compare(Book arg0, Book arg1){
			return arg0.publisher.compareTo(arg1.publisher) == 0
					? arg0.title.compareTo(arg1.title)
					: arg0.publisher.compareTo(arg1.publisher);
		}
	};
}