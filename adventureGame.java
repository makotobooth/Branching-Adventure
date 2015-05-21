import java.util.*;
import java.io.*;
import java.awt.*;

public class adventureGame{

   public static void main(String[] args) throws FileNotFoundException{
      Scanner intro = new Scanner(new File("AdventureIntro"));
      Scanner setting = new Scanner(new File("Setting"));
      Scanner console = new Scanner(System.in);
      intro(console, intro, setting);
      Player pla = new Player("buttmunch");
      int areaStart = 1;
    
      while(pla.isAlive()){
         Choice bleh = new Choice(areaStart);
         bleh.askChoice();
       
         int a = console.nextInt();
       
         while(a != 1 && a != 2){
            System.out.println("Please Enter 1 or 2");
            a = console.nextInt();
         }
        
         areaStart = bleh.getArea(a);
        
         if(pla.isAlive() == false){
            System.out.println("Nobody found the body. Try Again?");
            String ans = console.nextLine();
            if(ans.startsWith("y") || ans.startsWith("Y")){
               areaStart = 1;
            }
         }
      }
   }
   public static void intro(Scanner console, Scanner intro, Scanner setting){
      while(intro.hasNextLine()){
         System.out.println(intro.nextLine());
      }
   
      String borg = console.nextLine();
      Player bleh = new Player(borg);
      while(setting.hasNextLine()){
         System.out.println(setting.nextLine());
      }

   
   }
}