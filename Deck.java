/* Mandy Erdei
   CS 110
   Deck - makes ArrayList of 52 standard deck with shuffle & deal capabilities
   */
   
import java.util.Random;
import java.util.ArrayList;

/** 
Deck makes ArrayList of 52 standard deck with shuffle & deal capabilities
*/
public class Deck
{
   /** 
      Number of cards in standard deck {@value #CARDS_IN_DECK}
   */
   final int CARDS_IN_DECK = 52;

   /** The collection of Cards */
   private ArrayList<Card> deck;
   
  /**
    Constructs a regular 52-card deck.  Initially, the cards
    are in a sorted order.  The shuffle() method can be called to
    randomize the order.  
  */
   public Deck()
   {
      newDeck();
   }
   
   /**
    Create a new collection of 52 cards, in sorted order
   */
   public void newDeck()
   {
      deck = new ArrayList<Card>();
      //System.out.println(deck.size());

      for (int r = Card.ACE; r<=Card.KING;r++)
      {
         for (int s=Card.SPADES;s<=Card.DIAMONDS;s++)
         {
           deck.add(new Card(s,r));
         }
      }  
   }
   
   /** 
     Remove and return the top Card on the Deck
     @return A reference to a Card that was top on the Deck
     */
   public Card dealCard()
   {
      Card c = deck.remove(0);  //  remove it (returns removed object)
      return c;
   }
   
   /** 
     Return current number of Cards in Deck
     @return number of Cards in Deck
     */
   public int cardsRemaining()
   {  
      return deck.size();
   }
   
   /** 
     Randomize the order of Cards in Deck
   */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i);
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp);
      }      
   }
   
   /** 
     Determine if Deck is empty
     @return true if there are no more cards, false otherwise
  */
   public boolean isEmpty()
   {
      return (deck.size() == 0);
   }
   
   public static void main(String [] args) 
   {
      //create a new deck = arraylist of cards
      Deck deck = new Deck();
      
      //print the ordered deck
      while (!deck.isEmpty())
         System.out.println(deck.dealCard());
         
      //create a new deck
      Deck deck2 = new Deck();
    
      //shuffle deck
      deck2.shuffle();
      
      //print shuffled deck
      while (!deck2.isEmpty())
         System.out.println(deck2.dealCard()); 
         
      //create a new deck
      Deck deck3 = new Deck();
    
      //shuffle deck
      deck3.shuffle();  
      
      //remove and print first card in pile
      System.out.println("You just flipped: " + deck3.dealCard());
             
           
   }

}

