package DomainDesignEnImplementatie;

public class Golf {
    public int hoeveelheid;
    public int lagen;
    public double tijd;

    public Golf(int hoeveelheid, int lagen, int tijd) {
        this.hoeveelheid = hoeveelheid;
        this.lagen = lagen;
        this.tijd = tijd;
    }

    @Override
    public String toString() {
        return "De Golf heeft " + hoeveelheid + " ballonnen"+
                ", met " + lagen + " lagen"+
                ", En die moeten gepopt zijn binnen " + tijd + " seconden";
    }
}
