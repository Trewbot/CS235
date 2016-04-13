package cs235.prac10;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class TestHashSet {
	public static void main(String[] a){
		Book book1 = new Book(1,"The Meaning of Life"),
			 book1Dup = new Book(1,"The Meaning of Life"),
			 book2 = new Book(2,"Quantum Electrodynamics"),
			 book3 = new Book(3,"A Collection of Memoirs");
		Set<Book> set1 = new HashSet<Book>(Arrays.asList(book1,book1Dup,book2,book3));
		System.out.println(set1); //	Only shows 3 because book1Dup is a duplicate
		set1.add(book2);
		System.out.println(set1); //	Doesn't change because book2 is already in set
		set1.remove(book1);
		set1.remove(book3);
		System.out.println(set1);
		Set<Book> set2 = new HashSet<Book>(Arrays.asList(book3));
		System.out.println(set2);
		set2.addAll(set1);
		System.out.println(set2);
		set2.removeAll(set1);
		System.out.println(set2);
	}
}