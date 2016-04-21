package cs235.lab7;
import java.util.*;
import cs235.lab7.ICard.*;
public class Deck {
	private List<ICard> cards;
	public Deck(){
		cards = new ArrayList<ICard>();
		for(Suit suit:Suit.values())
			for(Rank rank:Rank.values())
				cards.add(new Card(suit,rank));
		Collections.shuffle(cards);
	}
	public void sort(){Collections.sort(this.cards);}
	public void shuffle(){Collections.shuffle(this.cards);}
	public void print(){
		for(ICard card:this.cards)
			System.out.println(card);
	}
}
