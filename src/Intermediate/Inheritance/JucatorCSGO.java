package Intermediate.Inheritance;

public class JucatorCSGO extends Jucatori{

    String favMap;
    String role;
    int nades;

    public JucatorCSGO(String name, String team, Float winrate, Integer skillLvl, String favMap, String role, Integer nades){
        super(name,team,winrate,skillLvl);
        this.favMap=favMap;
        this.role=role;
        this.nades=nades;
    }
    public void learnNade(){
        nades++;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Harta favorita: " + favMap);
        System.out.println("Rol: " + role);
        System.out.println("Grenade stiute: " + nades);
    }
}
