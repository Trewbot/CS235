package cs235.lab2;
public class TestBookV2{
	public static void main(String[] args){
		//	5.2.a
		Author[] authors = {
			new Author("Brett McLaughlin","brett@oreilly.com",'m'),
			new Author("Gary Police","gpolice@cs.wpi.edu",'m'),
			new Author("David West","dwest@ivarjacobson.com",'m')
			
		};
		BookV2 headFirstEtc = new BookV2("Head First Object-Oriented Analysis & Design",authors,59.99);
		//	5.2.b
		System.out.println(headFirstEtc);
		//	5.2.c
		System.out.println("This book was written by: ");
		headFirstEtc.printAuthors();
	}
}
