package cs235.lab2;
public class Book {
	//	2.a
	private String name;
	private Author author;
	private double price;
	//	2.b
	public Book(String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	//	2.c
	public String getName(){return name;}
	public Author getAuthor(){return author;}
	public double getPrice(){return price;}
	public void setPrice(double price){this.price = price;}
	//	2.d
	public String toString(){return "'" + this.name + "' by " + this.author;}
	//	4
	public String getAuthorName(){return author.getName();}
	public String getAuthorEmail(){return author.getEmail();}
	public char getAuthorGender(){return author.getGender();}
}