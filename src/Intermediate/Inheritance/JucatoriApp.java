package Intermediate.Inheritance;

public class JucatoriApp {
    public static void main(String[] args) {
        JucatorLoL Faker = new JucatorLoL("Faker","SKTT1",58F,89, "Zed", "mid", 20);
        JucatorLoL bjergsen = new JucatorLoL("bjergsen","Team Liquid",56F, 85,"LeBlanc","mid",18);

        JucatorCSGO flusha = new JucatorCSGO("flusha", "gorliiaz", 52F, 88 , "Mirage", "IGL", 35);
        JucatorCSGO s1mple = new JucatorCSGO("s1mple", "NaVi", 49F, 86 , "Dust2", "AWPer", 20);

        Jucatori[] jucatori = new Jucatori[4];

        jucatori[0]=Faker;
        jucatori[1]=bjergsen;
        jucatori[2]=flusha;
        jucatori[3]=s1mple;

        Faker.train();
        Faker.learnChamp();
        flusha.learnNade();

        for(Jucatori Jucatori : jucatori)
        {
            System.out.println("------------------------------------");
            Jucatori.getBio();
        }

    }
}
