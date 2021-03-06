package DomainDesignEnImplementatie;

public class DartMonkey implements Toren {
    final int monkeyPower = 10;
    int prijs = 150;

    public void KoopToren() {
        Speler.geld -= prijs;
        Speler.popPower += monkeyPower;
    }

    public void VerkoopToren() {
        Speler.geld += prijs * 0.7;
        Speler.popPower -= monkeyPower;
    }

    @Override
    public String toString() {
        return "DartMonkey{" +
                "monkeyPower=" + monkeyPower +
                ", prijs=" + prijs +
                '}';
    }
}
