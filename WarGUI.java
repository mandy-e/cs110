/* Mandy Erdei
   CS 110
   WarGUI - game of war as a GUI
   */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

/** 
WarGUI the game of war as a fun Star Wars themed GUI
*/
public class WarGUI extends JFrame
{
   private War game;                   //the game rules
   private JPanel startPanel;          //to hold start up image
   private JPanel startButtonPanel;    //to hold button
   private JLabel startLabel;          //to hold start up image
   private JButton startButton;        //to get start up image
   private int DELAY = 1000;           //timer to delay so can see card img
   private JPanel panelN;              //the north panel
   private JPanel panelS;              //the south panel
   private JPanel panelE;              //the east panel
   private JPanel panelW;              //the west panel
   private JPanel panelC;              //the center panel
   private JLabel p1Hand;              //the player 1 = light's hand
   private JLabel p2Hand;              //the player 2 = dark's hand
   private JLabel header;              //the heading label message
   private JLabel thePot;              //the cards put down each round
   private JButton footer;             //the footer label with button
   ImageIcon player1Img;               //player 1's card images
   ImageIcon player2Img;               //player 2's card images
   
   // build the GUI
   public WarGUI()
   {
      //set title
      setTitle("GAME OF WAR");
      
      //close the game by x-ing out
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //create a layout manager
      setLayout(new BorderLayout());
      
      //build panels
      buildImagePanel();
      buildButtonPanel();
      
      //add panels to content pane
      add(startPanel, BorderLayout.CENTER);
      add(startButtonPanel, BorderLayout.SOUTH);
      
      //pack and display window
      pack();
      setVisible(true);
   }
      
   /**
      buildImagePanel method adds imaged label to panel
   */
   private void buildImagePanel()
    {
      //create panel
      startPanel = new JPanel();
      startPanel.setBackground(Color.BLACK);
      
      //get starting war image
      ImageIcon warImage = new ImageIcon("start-star.png");
               
      //create label
      startLabel = new JLabel("BEGIN");
      startLabel.setIcon(warImage); 
                 
      //add label to panel
      startPanel.add(startLabel);
      
      //remove text from label
      startLabel.setText(null);
      
      //pack
      pack();
   }
      
   /**
      buildButtonPanel method adds button to panel
   */
   private void buildButtonPanel() 
   {
      //create panel
      startButtonPanel = new JPanel();
         
      //create button
      startButton = new JButton("BEGIN");
         
      //register action listener with button
      startButton.addActionListener(new ButtonListener());
         
      //add button to panel
      startPanel.add(startButton);
   }
      
   /**
      inner class that handles event when user clicks button
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {           
         //hide the startPanel
         startPanel.show(false);  
                
         //start new game
         game = new War(); 
            
         //set layout
         setLayout(new BorderLayout());
         
         //create 5 panels
          panelN = new JPanel();
          panelN.setBackground(Color.BLACK);
          panelS = new JPanel();
          panelS.setBackground(Color.BLACK);
          panelE = new JPanel();
          panelE.setBackground(Color.DARK_GRAY);
          panelW = new JPanel();
          panelW.setBackground(Color.LIGHT_GRAY);
          panelC = new JPanel();
          panelC.setBackground(Color.LIGHT_GRAY);
     
         // ~~~~~~ PanelN STUFF ~~~~~~~~~~
          header = new JLabel("A War Started Long Ago...");
          header.setFont(new Font("Courier New", Font.ITALIC, 20));
          header.setForeground(Color.YELLOW);
         
         // ~~~~~~ PanelS STUFF ~~~~~~~~~~
          footer = new JButton("Attack");
          
         //register action listener with button
         footer.addActionListener(new ButtonListener2());
         
         //add button to panel
         panelS.add(footer);
         
         // ~~~~~~ PanelE STUFF ~~~~~~~~~~
         
         //p2Hand label
         //get facedown card image
         Card card = new Card(2, 4);
         String blankCard = card.getPicture();
         ImageIcon player2Img = new ImageIcon(blankCard);
         p2Hand = new JLabel("Dark Side: " + game.player2.size() + " cards");
         p2Hand.setFont(new Font("Courier New", Font.BOLD, 12));
         p2Hand.setForeground(Color.WHITE);
         
         //set image
         p2Hand.setIcon(player2Img); 
              
         //add label to panel
         panelE.add(p2Hand);
      
         // ~~~~~~ PanelW STUFF ~~~~~~~~~~
         //get facedown card image      
         ImageIcon player1Img = new ImageIcon(blankCard);
         p1Hand = new JLabel("Light Side: " + game.player1.size() + " cards");
         p1Hand.setFont(new Font("Courier New", Font.BOLD, 12));
         p1Hand.setForeground(Color.BLACK);

         //set image
         p1Hand.setIcon(player1Img); 
               
         //add label to panel
         panelW.add(p1Hand);
         
         thePot = new JLabel("");
         
         //add stuff to 5 panels
         panelN.add(header);
         panelS.add(footer);
         panelE.add(p2Hand);
         panelW.add(p1Hand);
         panelC.add(thePot);
         
         //add 5 panels to content pane
         add(panelN, BorderLayout.NORTH);
         add(panelS, BorderLayout.SOUTH);
         add(panelE, BorderLayout.EAST);
         add(panelW, BorderLayout.WEST);
         add(panelC, BorderLayout.CENTER);
         

          
         //pack and display window
         pack();
         setVisible(true);        
      }
         
         /**
            ButtonListener2 inner class that handles event when user clicks button
         */
         private class ButtonListener2 implements ActionListener
         {         
            public void actionPerformed(ActionEvent e)
            { 
               //run 1 iteration of the game for each button click
               game.runGame();
                              
               //get picture
               player1Img = new ImageIcon(game.topcard1.getPicture(game.topcard1));
               player2Img = new ImageIcon(game.topcard2.getPicture(game.topcard2));
               
               //re-assign size labels
               p1Hand.setText("Light Side:" + game.player1.size() + " cards");
               p2Hand.setText("Dark Side:" + game.player2.size() + " cards");
               
               //re-assign image in label
               p1Hand.setIcon(player1Img);
               p2Hand.setIcon(player2Img);
               
               //write text to be winner message for each round
               header.setText(game.winner);
            }
         }
      }
   }    
