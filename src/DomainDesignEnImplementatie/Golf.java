package DomainDesignEnImplementatie;

public class Golf {
    public int hoeveelheid;
    public int lagen;
    public int tijd;
    public int opbrengst;

    public Golf(int hoeveelheid, int lagen, int tijd, int opbrengst) {
        this.hoeveelheid = hoeveelheid;
        this.lagen = lagen;
        this.tijd = tijd;
        this.opbrengst = opbrengst;
    }

    @Override
    public String toString() {
        return "De Golf heeft " + hoeveelheid + " ballonnen"+
                ", met " + lagen + " lagen"+
                ", En die moeten gepopt zijn binnen " + tijd + " seconden";
    }
}
