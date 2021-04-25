package DomainDesignEnImplementatie;

public class Speler {
    private String naam;
    private int levens;
    private int geld;

    public Speler(String naam, int levens, int geld) {
        this.naam = naam;
        this.levens = levens;
        this.geld = geld;
    }

    public int getLevens() {
        return levens;
    }

    public void setLevens(int levens) {
        this.levens = levens;
    }

    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    @Override
    public String toString() {
        return "Speler{" +
                "naam='" + naam + '\'' +
                ", levens=" + levens +
                ", geld=" + geld +
                '}';
    }

    public static void main(String[] args) {
        Speler s1 =  new Speler("Luuk", 150, 0);
        s1.setLevens((s1.levens)-10);
        System.out.println(s1.toString());
        Golf g1 =  new Golf(15, 1, 60);
        System.out.println(g1.toString());
    }
}
