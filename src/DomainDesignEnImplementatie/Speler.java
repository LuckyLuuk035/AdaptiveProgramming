package DomainDesignEnImplementatie;

public class Speler {
    public static double popPower;
    public static int geld = 350;
    private String naam;
    private int levens = 150;

    public Speler(String naam) {
        this.naam = naam;
        this.popPower = getPopPower();
    }

    public int getLevens() {
        if (levens <= 0){System.out.println("GameOver");}
            return levens;
    }

    public void setLevens(int levens) {
        this.levens = levens;
    }

    public double getPopPower() {
        return popPower;
    }

    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    @Override
    public String toString() {
        return "Speler:" + naam + '\'' +
                ", levens=" + levens +
                ", geld=" + geld +
                ", popPower=" + popPower + "\n";
    }

    public static void main(String[] args) {
        // Voor het tonen van de functionaliteit simuleer ik een kort potjes tussen mij en mijn broertje.
        // Eerst maak ik de spelers aan voor mij en mijn broertje.
        Speler s1 = new Speler("Luuk");

        // Maak de object voor de golf en aapjes aan.
        Golf g1 =  new Golf(15);
        DartMonkey d1 = new DartMonkey();
        NinjaMonkey n1 = new NinjaMonkey();
        BoomerangMonkey b1 = new BoomerangMonkey();

        System.out.println(g1.toString());

        System.out.println(s1.toString());

        //Koop torens ter verdediging.
        if(s1.getGeld() > d1.prijs){d1.KoopToren();}

        //Bereken de schade.
        if(g1.hoeveelheid > s1.getPopPower()){
            s1.setLevens((int) (s1.levens - (g1.hoeveelheid - s1.getPopPower())));}

        // print de variable wanneer de golf voorbij is.
        System.out.println(s1.toString());
    }
}
