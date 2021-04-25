package DomainDesignEnImplementatie;

public class DartMonkey implements Toren {
    int monkeyPower;
    int prijs;

    public DartMonkey(int monkeyPower, int prijs) {
        this.monkeyPower = monkeyPower;
        this.prijs = prijs;
    }

    public void increasePopPower() {
        Speler.popPower += monkeyPower;
    }

    public void UpgradeMonkey() {

    }

}
