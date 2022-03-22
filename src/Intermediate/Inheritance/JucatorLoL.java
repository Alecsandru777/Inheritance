package Intermediate.Inheritance;

public class JucatorLoL extends Jucatori{

    String champion;
    String position;
    int champPool;

    public JucatorLoL(String name,String team,Float winrate,int skillLvl,String champion, String position, Integer champPool){
        super(name,team,winrate,skillLvl);
        this.champion=champion;
        this.position=position;
        this.champPool=champPool;
    }
    public void learnChamp(){
        champPool++;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("main: " + champion);
        System.out.println("pozitie: " + position);
        System.out.println("Champion Pool: " + champPool);
    }
}
