package cs235.lab7;
public class Card implements ICard{
	private Suit suit;
	private Rank rank;
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	@Override public int compareTo(ICard arg0) {
		return this.rank.compareTo(arg0.getRank()) == 0
			? this.suit.compareTo(arg0.getSuit())
			: this.rank.compareTo(arg0.getRank());
	}
	@Override public Suit getSuit(){return suit;}
	@Override public Rank getRank(){return rank;}
	public String toString(){return rank + " OF " + suit;}
}
