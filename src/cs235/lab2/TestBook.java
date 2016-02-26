package cs235.lab2;
public class TestBook {
	public static void main(String args[]){
		//	3.a
		Author collinsw = new Author("William Collins","collinsw@lafayette.edu",'m');
		//	3.b
		Book dataStrucEtc = new Book("Data Structures and the Java Collections Framework", collinsw, 112.89);
		//	3.c
		System.out.println(dataStrucEtc);
		//	3.d
		collinsw.setEmail("collinsw@cs.lafayett.edu");
		//	3.e
		System.out.println(dataStrucEtc);
		//	4
		System.out.println("\nThis book was written by: " + dataStrucEtc.getAuthorName());
		System.out.println("The author's email address is: " + dataStrucEtc.getAuthorEmail());
		System.out.println("The author's gender is: " + dataStrucEtc.getAuthorGender());
	}
}
