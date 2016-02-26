package cs235.lab2;
public class BookV2{
	private String name;
	private Author[] authors;
	private double price;
	public BookV2(String name, Author author, double price){
		this.name = name;
		this.authors = new Author[]{author.getCopy()};
		this.price = price;
	}
	//	5.1.a
	public BookV2(String name, Author[] authors, double price){
		this.name = name;
		this.authors = new Author[authors.length];
		for(int i = 0; i < authors.length; i++)
			this.authors[i] = authors[i].getCopy();
		this.price = price;
	}
	public String getName(){return name;}
	public Author[] getAuthors(){return authors;}
	public double getPrice(){return price;}
	public void setPrice(double price){this.price = price;}
	//	5.1.b
	public String toString(){return "'" + this.name + "' by " + this.authors.length + " author(s)";}
	//	5.1.c
	public void printAuthors(){
		for(int i = 0; i < this.authors.length; i++)
			System.out.print(this.authors[i].getName() + (i == this.authors.length - 2 ? " and " : (i == this.authors.length - 1 ? "": ", ")));
		System.out.println();
	}
}