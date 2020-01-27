// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment.


public class Lab11bvst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck
{
	private Card[] cards;
	private int size;
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	private String[] rank = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private String[] value = {"2","3","4","5","6","7","8","9","10","11"};
	public Deck()
   {
      size = 52;
		cards = new Card[size];
	}
	 }
