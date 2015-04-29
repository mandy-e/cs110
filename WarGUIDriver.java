/* Mandy Erdei
   CS 110
   WarGUIDriver - starts the game of war as a GUI
   */
import javax.swing.*;

/** 
WarGUIDriver starts the game of war as a GUI
*/
public class WarGUIDriver
{
   public static void main(String [] args)
   {
      JFrame frame = new WarGUI();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
      // OR
      frame.setSize(700,600);
      frame.validate();
      frame.setVisible(true);
   }
}