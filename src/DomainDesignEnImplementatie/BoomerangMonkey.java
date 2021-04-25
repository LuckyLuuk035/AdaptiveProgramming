package DomainDesignEnImplementatie;

public class BoomerangMonkey implements Toren {
    final int monkeyPower = 20;
    int prijs = 350;

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
        return "BoomerangMonkey{" +
                "monkeyPower=" + monkeyPower +
                ", prijs=" + prijs +
                '}';
    }
}
