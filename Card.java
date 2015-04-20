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
   
   /** array list of card images */
   //private ArrayList<Image> cardFaces;   
   
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
      getPicture method returns the rank
      @param suit the suit of the card
      @param rank the rank of the card
      @return The picture of turned over card
   */
   public String getRank(int suit, int rank)
   {
     picture = "back.jpg";
     
     //if statements to get the right image
     if (suit == SPADES)
     {
         if (rank == ACE)
            picture = "01s.jpg";
         
         if (rank == 2)
            picture = "02s.jpg";
            
         if (rank == 3)
            picture = "03s.jpg";
            
         if (rank == 4)
            picture = "04s.jpg";
            
         if (rank == 5)
            picture = "05s.jpg";
            
         if (rank == 6)
            picture = "06s.jpg";

         if (rank == 7)
            picture = "07s.jpg";
            
         if (rank == 8)
            picture = "08s.jpg";
            
         if (rank == 9)
            picture = "09s.jpg";
            
         if (rank == 10)
            picture = "10s.jpg";
            
         if (rank == JACK)
            picture = "11s.jpg";
            
         if (rank == QUEEN)
            picture = "12s.jpg";
            
         if (rank == KING)
            picture = "13s.jpg";
     }
     //if statements to get the right image
     if (suit == CLUBS)
     {
         if (rank == ACE)
            picture = "01s.jpg";
         
         if (rank == 2)
            picture = "02s.jpg";
            
         if (rank == 3)
            picture = "03s.jpg";
            
         if (rank == 4)
            picture = "04s.jpg";
            
         if (rank == 5)
            picture = "05s.jpg";
            
         if (rank == 6)
            picture = "06s.jpg";

         if (rank == 7)
            picture = "07s.jpg";
            
         if (rank == 8)
            picture = "08s.jpg";
            
         if (rank == 9)
            picture = "09s.jpg";
            
         if (rank == 10)
            picture = "10s.jpg";
            
         if (rank == JACK)
            picture = "11s.jpg";
            
         if (rank == QUEEN)
            picture = "12s.jpg";
            
         if (rank == KING)
            picture = "13s.jpg";
     }
     //if statements to get the right image
     if (suit == DIAMONDS)
     {
         if (rank == ACE)
            picture = "01s.jpg";
         
         if (rank == 2)
            picture = "02s.jpg";
            
         if (rank == 3)
            picture = "03s.jpg";
            
         if (rank == 4)
            picture = "04s.jpg";
            
         if (rank == 5)
            picture = "05s.jpg";
            
         if (rank == 6)
            picture = "06s.jpg";

         if (rank == 7)
            picture = "07s.jpg";
            
         if (rank == 8)
            picture = "08s.jpg";
            
         if (rank == 9)
            picture = "09s.jpg";
            
         if (rank == 10)
            picture = "10s.jpg";
            
         if (rank == JACK)
            picture = "11s.jpg";
            
         if (rank == QUEEN)
            picture = "12s.jpg";
            
         if (rank == KING)
            picture = "13s.jpg";
     }
     //if statements to get the right image
     if (suit == HEARTS)
     {
         if (rank == ACE)
            picture = "01s.jpg";
         
         if (rank == 2)
            picture = "02s.jpg";
            
         if (rank == 3)
            picture = "03s.jpg";
            
         if (rank == 4)
            picture = "04s.jpg";
            
         if (rank == 5)
            picture = "05s.jpg";
            
         if (rank == 6)
            picture = "06s.jpg";

         if (rank == 7)
            picture = "07s.jpg";
            
         if (rank == 8)
            picture = "08s.jpg";
            
         if (rank == 9)
            picture = "09s.jpg";
            
         if (rank == 10)
            picture = "10s.jpg";
            
         if (rank == JACK)
            picture = "11s.jpg";
            
         if (rank == QUEEN)
            picture = "12s.jpg";
            
         if (rank == KING)
            picture = "13s.jpg";
     }
     
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
      String cardStr = "This card is the " + rank + " of " + suitName;
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
                            
}