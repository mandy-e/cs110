/* Mandy Erdei
   CS 110
   Card - defines the card deck into numerical values for suits and ranks
   */
   
/** 
Card defines the card deck into numerical values for suits and ranks
*/
public class Card
{
   //Declare the constants
   public static final int SPADES = 1;
   public static final int CLUBS = 2;
   public static final int HEARTS = 3;
   public static final int DIAMONDS = 4;
   public static final int ACE = 1;
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;
      
   private int rank;          //rank of cards  
   private int suit;          //suit value of card
   private String picture;    //picture of each card
   private String suitName;   //suit name not value
   private String rankName;   //rank name not value
   private String cardStr;    //the card's values as a string
    
   /**
      Alternate Constructor
      @param suit The suit the user enters
      @param rank The rank the user enters
   */
   public Card (int suit, int rank)
   {
      this.suit = suit;
      this.rank = rank;
   }  
   
   /**
      getSuit method returns the suit
      @return The suit of card
   */
   public int getSuit()
   {
      return suit;
   }
   
   /**
      getRank method returns the rank
      @return The rank of card
   */
   public int getRank()
   {
      return rank;
   }
   
   /**
      getPicture method returns the back of card
      @return the picture of the card back
   */
   public String getPicture()
   {
      picture = "cardpics/back.jpg";
      return picture;
   }
   /**
      getPicture method returns the card face picture
      @param suit the suit of the card
      @param rank the rank of the card
      @return The picture of turned over card
   */
   public String getPicture(Card obj)
   {
     picture = "cardpics/back.jpg";
     
     //if statements to get the right image
     if (suit == SPADES)
     {
         if (rank == ACE)
            picture = "cardpics/01s.jpg";
         
         if (rank == 2)
            picture = "cardpics/02s.jpg";
            
         if (rank == 3)
            picture = "cardpics/03s.jpg";
            
         if (rank == 4)
            picture = "cardpics/04s.jpg";
            
         if (rank == 5)
            picture = "cardpics/05s.jpg";
            
         if (rank == 6)
            picture = "cardpics/06s.jpg";

         if (rank == 7)
            picture = "cardpics/07s.jpg";
            
         if (rank == 8)
            picture = "cardpics/08s.jpg";
            
         if (rank == 9)
            picture = "cardpics/09s.jpg";
            
         if (rank == 10)
            picture = "cardpics/10s.jpg";
            
         if (rank == JACK)
            picture = "cardpics/11s.jpg";
            
         if (rank == QUEEN)
            picture = "cardpics/12s.jpg";
            
         if (rank == KING)
            picture = "cardpics/13s.jpg";
     }
     
     //if statements to get the right image
     if (suit == CLUBS)
     {
         if (rank == ACE)
            picture = "cardpics/01c.jpg";
         
         if (rank == 2)
            picture = "cardpics/02c.jpg";
            
         if (rank == 3)
            picture = "cardpics/03c.jpg";
            
         if (rank == 4)
            picture = "cardpics/04c.jpg";
            
         if (rank == 5)
            picture = "cardpics/05c.jpg";
            
         if (rank == 6)
            picture = "cardpics/06c.jpg";

         if (rank == 7)
            picture = "cardpics/07c.jpg";
            
         if (rank == 8)
            picture = "cardpics/08c.jpg";
            
         if (rank == 9)
            picture = "cardpics/09c.jpg";
            
         if (rank == 10)
            picture = "cardpics/10c.jpg";
            
         if (rank == JACK)
            picture = "cardpics/11c.jpg";
            
         if (rank == QUEEN)
            picture = "cardpics/12c.jpg";
            
         if (rank == KING)
            picture = "cardpics/13c.jpg";
     }
     
     //if statements to get the right image
     if (suit == DIAMONDS)
     {
         if (rank == ACE)
            picture = "cardpics/01d.jpg";
         
         if (rank == 2)
            picture = "cardpics/02d.jpg";
            
         if (rank == 3)
            picture = "cardpics/03d.jpg";
            
         if (rank == 4)
            picture = "cardpics/04d.jpg";
            
         if (rank == 5)
            picture = "cardpics/05d.jpg";
            
         if (rank == 6)
            picture = "cardpics/06d.jpg";

         if (rank == 7)
            picture = "cardpics/07d.jpg";
            
         if (rank == 8)
            picture = "cardpics/08d.jpg";
            
         if (rank == 9)
            picture = "cardpics/09d.jpg";
            
         if (rank == 10)
            picture = "cardpics/10d.jpg";
            
         if (rank == JACK)
            picture = "cardpics/11d.jpg";
            
         if (rank == QUEEN)
            picture = "cardpics/12d.jpg";
            
         if (rank == KING)
            picture = "cardpics/13d.jpg";
     }
     
     //if statements to get the right image
     if (suit == HEARTS)
     {
         if (rank == ACE)
            picture = "cardpics/01h.jpg";
         
         if (rank == 2)
            picture = "cardpics/02h.jpg";
            
         if (rank == 3)
            picture = "cardpics/03h.jpg";
            
         if (rank == 4)
            picture = "cardpics/04h.jpg";
            
         if (rank == 5)
            picture = "cardpics/05h.jpg";
            
         if (rank == 6)
            picture = "cardpics/06h.jpg";

         if (rank == 7)
            picture = "cardpics/07h.jpg";
            
         if (rank == 8)
            picture = "cardpics/08h.jpg";
            
         if (rank == 9)
            picture = "cardpics/09h.jpg";
            
         if (rank == 10)
            picture = "cardpics/10h.jpg";
            
         if (rank == JACK)
            picture = "cardpics/11h.jpg";
            
         if (rank == QUEEN)
            picture = "cardpics/12h.jpg";
            
         if (rank == KING)
            picture = "cardpics/13h.jpg";
     }
     //return face up card image
     return picture;
   }
         
   /**
      toString method
      @return The card's suit and rank as a String
   */   
   public String toString()
   {
      //Create a string describing the card
      suitNameConverter();
      rankNameConverter();
      
      //if statement for if we need a rankName instead of rank
      if (rank == 1 | rank == 11 | rank == 12 | rank == 13)
      {
         cardStr = "The " + rankName + " of " + suitName;
      }
      else
      {
         cardStr = "The " + rank + " of " + suitName;
      }
      return cardStr;
   }
   
   /**
      suitNameConverter takes the suit value, converts it to a String, returns String
      @return suitName the suit's name
   */
   public String suitNameConverter()
   {  
      //if statements for which category it belongs to based on its value
      if (suit == 1)
      {
         suitName = "Spades";
      }
      else if (suit == 2)
      {
         suitName = "Clubs";
      }
      else if (suit == 3)
      {
         suitName = "Hearts";
      }
      else if (suit == 4)
      {
         suitName = "Diamonds";
      }
      return suitName;
   }
   /**
      rankNameConverter takes the rank value, converts it to a String, returns String
      @return the rank's name
   */
   public String rankNameConverter()
   {  
      //if statements for which category it belongs to based on its value
      if (rank == 1)
      {
         rankName = "Ace";
      }
      else if (rank == 11)
      {
         rankName = "Jack";
      }
      else if (rank == 12)
      {
         rankName = "Queen";
      }
      else if (rank == 13)
      {
         rankName = "King";
      }
      return rankName;
   }
      
    /** equals method if card 1 = card 2 based on the card's rank only
      @return status tells whether boolean true or false
      */
      public boolean equals (Card object2)
      {
         boolean status;
         
         if (rank == object2.rank)
         {
            status = true;
         }
         else 
         {
            status = false;
         }
         
         return status;
      }
      
    /** isGreater method if card 1 > card 2 based on the card's rank only
      @return status tells whether boolean true or false
      */
      public boolean isGreater (Card object2)
      {
         boolean status;
         
         if (rank > object2.rank)
         {
            status = true;
         }
         else 
         {
            status = false;
         }
         
         return status;
      }                                
}