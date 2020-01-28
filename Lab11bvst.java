// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment.


public class Lab11bvst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      deck.add("Clubs","Three",3);
			deck.display();
			System.out.println(deck.size());
			System.out.println(deck.isEmpty());
	}
}


class Deck
{
	private Card[] cards;
	private int size;
	private String suits[] = {"Clubs","Diamonds","Hearts","Spades"};
	private String rank[] = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private int value[] = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	public Deck(){
		public void add(String suit, String rank, int value)
			{
			 Card temp = new Card(suit, rank,value);
			 cards[size] = temp;
			 size++;
	}
}
	public void add(String suit, String rank, int value)
		{
		 Card temp = new Card(suit, rank,value);
		 cards[size] = temp;
		 size++;
	 	}
		public void display()
		{
			for(int k = 0; k<size; k++)
				System.out.println(cards[k]);
			System.out.println();
		}

	 		public int size()		{ return size; }
			public boolean isEmpty() { return size == 0; }

		}
