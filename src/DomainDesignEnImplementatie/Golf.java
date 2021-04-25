package DomainDesignEnImplementatie;

public class Golf {
    public int hoeveelheid;
    public int opbrengst;

    public Golf(int hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
        this.opbrengst = 450;
    }

    @Override
    public String toString() {
        return "De Golf heeft " + hoeveelheid + " ballonnen";
    }
}
