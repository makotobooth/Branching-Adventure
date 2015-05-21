import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiTester{
//    public static void main(String[] args){
//       String name = JOptionPane.showInputDialog(null, "What is your name");
//          
//          int choice = JOptionPane.showConfirmDialog(null, "Do you like adventures, buttmunch?");
//          
//          if (choice == JOptionPane.YES_OPTION){
//             JOptionPane.showMessageDialog(null, "Great, buttmunch.  No, your name is not " + name);
//          }
//          else{
//             JOptionPane.showMessageDialog(null, "Well you're no fun.");
//          }
   
   JFrame frame = new JFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getDefaultCloseOperation();
   
   JButton button = new JButton();
   button.setVisible(true);
   frame.add(button);
   frame.setVisible(true);
}
      
}