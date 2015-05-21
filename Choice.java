/*
  Basic choice object
*/

public class Choice{

   private String prompt;
   private String choice1;
   private String choice2;
   int area1;
   int area2;
   int healthReduction;

   public Choice(int area){
      if(area == 1){
         this.prompt = "The dots of purple trail off and stop at a small table hidden at the dark edge of the turret.  Atop the table are two drinks, a frothy green one and a swirling red.  Which one do you drink?";
         this.choice1 = "The red one.";
         this.choice2 =  "The green one.";
         this.area1 = 2;
         this.area2 = 3;
      }
      if(area == 2){
         this.prompt = "Your head begins to swirl and you black out for a second.  When you awake the previously featureless turret has two exits, a large wooden door and a large frought-iron one.  How shall you egress?";
         this.choice1 = "Through the wooden door.";
         this.choice2 =  "Through the frought-iron door.";
         this.area1 = 4;
         this.area2 = 5;
      }
      if(area == 3){
         this.prompt = "You convulse violently and somehow structurally destabilize the turret.  As the floor gives out, you see a coiled rope above you and a gaping blackness below you.  Go for the rope, or leap?";
         this.choice1 = "Use the rope to scale down the outside of the turret.";
         this.choice2 = "Make a leap of faith into the blackness and hope you land on something soft.";
         this.area1 = 6;
         this.area2 = 7;
      }
      if(area == 4){
         this.prompt = "Opening the wooden door you see a staircase spiraling downward.  You start down cautiously and stop at a door.  It is labeled, LIBRARY.  Enter it or go further down?";
         this.choice1 = "Enter it.";
         this.choice2 =  "Continue down the staircase.";
         this.area1 = 8;
         this.area2 = 9;
      }
      if(area == 5){
         this.prompt = "As you pass through the iron door, it abruptly closes behind you, clanging ominously.  As you go down the hallway it progressively darkens and you hear a growling noise.  Finally, you see what appears to be a snoring sphinx in front of you.  What do you do?";
         this.choice1 = "Fight it.";
         this.choice2 =  "Try to quietly move around it.";
         this.area1 = 10;
         this.area2 = 11;
      }
      if(area == 6){
         this.prompt = "You are able to get out of the building, but as you scale down the rope gives out and you fall 50 feet, breaking both legs.  You see a pathway leading behind you, but also see a half-open gate at the other end of the courtyard.  Where do you turn?";
         this.choice1 = "Down the pathway.";
         this.choice2 =  "Across the empty courtyard toward the door.";
         this.area1 = 1;
         this.area2 = 2;
      }
      if(area == 7){
         this.prompt = "Your calculated risk worked out.  You land in a deep fountain, drenching you but not harming you.  Your foot bumps against something metallic on the bottom as you bob in the water.  Investigate it or get out of the fountain?";
         this.choice1 = "Investigate.";
         this.choice2 =  "Just get out of the fountain.";
         this.area1 = 1;
         this.area2 = 2;
      }
      if(area == 8){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 =  "";
         this.area1 = 1;
         this.area2 = 2;
      }
      if(area == 9){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 =  "";
         this.area1 = 1;
         this.area2 = 2;
      }
      if(area == 10){
         this.prompt = "";
         this.choice1 = "";
         this.choice2 =  "";
         this.area1 = 1;
         this.area2 = 2;
      }
      else{
      }
   }
   public void askChoice(){
      System.out.println(prompt);
      System.out.println(choice1);
      System.out.println(choice2);
      
      
   }
   
   public int getArea(int a){
      if(a ==1){
         return this.area1;
      }
      else{
         return this.area2;
      }
   }

}