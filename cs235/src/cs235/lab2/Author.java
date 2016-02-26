package cs235.lab2;
public class Author{
	private String name, email;
	private char gender;
	public Author(String name, String email, char gender){
		this.name	= name;
		this.email	= email;
		this.gender	= gender;
	}
	public String	getName(){return name;}
	public String	getEmail(){return email;}
	public void		setEmail(String newEmail){email = newEmail;}
	public char		getGender(){return gender;}
	public String	toString(){return name + " (" + gender + ") at " + email;}
	//	5.1.a
	public Author	getCopy(){return new Author(this.name, this.email, this.gender);}
}