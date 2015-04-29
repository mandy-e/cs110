/* Mandy Erdei
   CS 110
   WarCW - runs a war game through the command window
   */

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
   
/** 
WarCW runs a war game through the command window
*/
public class WarCW extends Deck
{
   private Deck newGame;
   private ArrayList<Card> player1;
   private ArrayList<Card> player2;
   private ArrayList<Card> pot;
   private char go;
   
   /**
      Default constructor - sets up a game of War
   */
   public WarCW()
   {
      newGame = new Deck();
      //shuffles deck
      newGame.shuffle();
      //splits deck in 2
      split();
      
      //create the pot
      pot = new ArrayList<Card>();
      
      //UNCOMMENT FOR DO WHILE LOOP
      //do while loop unitl winner
      //do
      
      //while loop dependent on empty status of player's hands
      while (!player1.isEmpty() && !player2.isEmpty())
      {
         //create topcard values
         Card topcard1 = player1.get(0);
         Card topcard2 = player2.get(0);
         
         //print beginning of loop
         System.out.println("Player 1:" + player1.size());
         System.out.println("Player 2:" + player2.size()); 
                 
         //print topcard values
         System.out.println(topcard1);
         System.out.println(topcard2);
         
         //remove topcards from deck
         player1.remove(0);
         player2.remove(0);
         
         //add topcards to the pot
         pot.add(topcard1);
         pot.add(topcard2);
         

         //if player1 > player2
         if (topcard1.isGreater(topcard2))
         {
               
            //print player 1 is winner
            System.out.println("Player 1 wins this battle!");
               
            //compare the two topcards
            int size = pot.size();
            for (int i=0; i < size; i++)
            {
               //add each element in pot to player1
               player1.add(pot.get(0));
               
               //remove from pot
               pot.remove(0);
            }
            
            //end of round
            System.out.println("---------------");
         }
            
         //if player2 > player1
         else if (topcard2.isGreater(topcard1))
         {
               
            //print player 2 is winner
            System.out.println("Player 2 wins this battle!");
               
            //compare the two topcards
            int size = pot.size();
            for (int i=0; i < size; i++)
            {    
               //add all elements in pot to player2
               player2.add(pot.get(0));
                  
               //remove from pot
               pot.remove(0);           
            }
            
            //end of round
            System.out.println("---------------");
         }
            
         //if (topcard1.equals(topcard2))
         else
         {
            //print war message
            System.out.println("WAR - STALEMATE!");
            
            if (!player1.isEmpty() && !player2.isEmpty())
            {
               //add the next 2 cards to pot without comparing
               pot.add(player1.get(0));
               pot.add(player2.get(0));
                  
               //remove those 2 cards from players' hands
               player1.remove(0);
               player2.remove(0);
               
               //end of round
               System.out.println("---------------");
            }
            
            else
            {
               //display if the player ran out during war event
               if (player1.isEmpty())
               {
                  System.out.println("Player 1 ran out of cards");
               }
               else if (player2.isEmpty())
               {
                  System.out.println("Player 2 ran out of cards");
               }
               
               //end of round
               System.out.println("---------------");
            }
         }
         
//          //UNCOMMENT FOR DO WHILE LOOP
//          //conditions to continue game
//          Scanner keyboard = new Scanner(System.in);
//          System.out.println("Press 'f' to continue: ");
//          String input = keyboard.nextLine();
//          go = input.charAt(0);
      }
      
//       //UNCOMMENT FOR DO WHILE LOOP
//       //while so user can dictate speed of each round
//       while (go == 'f' && !player1.isEmpty() && !player2.isEmpty());

      //print overall winners
      if (player1.isEmpty())
      {
         System.out.println("\nPlayer 2 Wins the WAR");
      }
      else if (player2.isEmpty())
      {
         System.out.println("\nPlayer 1 Wins the WAR");
      }
   }
   
   /**
      split splits the deck into 2 ArrayLists for the 2 players
   */
   public void split()
   {
      //create the 2 players
      player1 = new ArrayList<Card>();
      player2 = new ArrayList<Card>();
      
      //for loop to add 1/2 deck to each
      for (int i=0; i < 26; i++)
      {
         player1.add(newGame.dealCard());
      }
      
      for (int i=26; i < 52; i++)
      {
         player2.add(newGame.dealCard());
      }
   }
   
   //create instance of class - play it!
   public static void main(String [] args) 
   {
      System.out.println("Welcome to WAR");
      WarCW firstGame = new WarCW();
   }
}