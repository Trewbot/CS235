package cs235.lab7;
public class Test {
	public static void main(String[] a){
		Deck deck = new Deck();
		System.out.println("Shuffled deck:");
		deck.print();
		
		deck.sort();
		System.out.println("\nSorted deck:");
		deck.print();
	}
}
