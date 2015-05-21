public class Player{

   private boolean life;
   private String name;

   public Player(String name){
      this.name = name;
      this.life = true;
   }

   public void kill(){
      this.life = false;
   }

   public boolean isAlive(){
      return this.life;
   }

   public String getName(){
      return this.name;
   }

}