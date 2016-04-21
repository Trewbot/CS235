package cs235.lab7;
public interface ICard extends Comparable<ICard> {
	enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}
	enum Rank {DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
	Suit getSuit();
	Rank getRank();
}
