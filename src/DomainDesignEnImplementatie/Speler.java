package DomainDesignEnImplementatie;
import java.util.Scanner;  // Import the Scanner class

public class Speler {
    public static double popPower;
    private String naam;
    private int levens;
    private int geld;

    public Speler(String naam, int levens, int geld, double popPower) {
        this.naam = naam;
        this.levens = levens;
        this.geld = geld;
        this.popPower = popPower;
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
        return "Speler{" +
                "naam='" + naam + '\'' +
                ", levens=" + levens +
                ", geld=" + geld +
                ", popPower=" + popPower +
                '}';
    }

    public static void main(String[] args) {
        Speler s1 =  new Speler("Luuk", 150, 300, 0);
        Golf g1 =  new Golf(15, 1, 60, 450);

        System.out.println(g1.toString());

        System.out.println(s1.toString());
    }
}


//s1.setLevens(if((s1.popPower - g1.hoeveelheid * g1.lagen) <= 0){int damage = });