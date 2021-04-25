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
        return levens;
    }

    public void setLevens(int levens) {
        this.levens = levens;
    }

    public double getPopPower() {
        return popPower;
    }

    public void setPopPower(int popPower) {
        this.popPower = popPower;
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
                ", popPower=" + popPower;
    }

    public static void main(String[] args) {
        // Voor het tonen van de functionaliteit simuleer ik een kort potjes tussen mij en mijn broertje.
        // Maak de spelers aan.
        Speler s1 = new Speler("Luuk");
        Speler s2 = new Speler("Ivo");

        Golf g1 =  new Golf(15);
        DartMonkey d1 = new DartMonkey();
        NinjaMonkey n1 = new NinjaMonkey();

        System.out.println(g1.toString());
        System.out.println(s1.toString());
        if(s1.geld > d1.prijs){d1.KoopToren();}
        if(g1.hoeveelheid > s1.getPopPower()){
            s1.setLevens((int) (s1.levens - (g1.hoeveelheid - s1.getPopPower())));}
        System.out.println(s1.toString());
    }
}
