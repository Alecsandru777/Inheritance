package Intermediate.Inheritance;

public class Jucatori {
   float winrate ;
   String echipa;
   private String nume;
   int skillLvl ;

   public Jucatori(String nume,String echipa,Float winrate,Integer skillLvl ) {
      this.winrate = winrate;
      this.echipa = echipa;
      this.nume = nume;
      this.skillLvl=skillLvl;
   }
   public void train(){
      skillLvl++;
   }
   public void getBio(){
      System.out.println("nume: " + nume);
      System.out.println("echipa: " + echipa);
      System.out.println("winrate: " + winrate);
      System.out.println("skill level: " + skillLvl);

   }
}
