package DomainDesignEnImplementatie;

public class NinjaMonkey implements Toren {
    final int monkeyPower = 50;
    int prijs = 550;

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
        return "NinjaMonkey{" +
                "monkeyPower=" + monkeyPower +
                ", prijs=" + prijs +
                '}';
    }
}
