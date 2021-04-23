package formatieveOpdracht1a.autoHuur;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;
    private double totaalPrijs;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    void totaalPrijs() {
//        totaalPrijs = (gehuurdeAuto.getPrijsPerDag() * aantalDagen) - (gehuurdeAuto.getPrijsPerDag() * aantalDagen - huurder.getKortingsPercentage());
        totaalPrijs = (gehuurdeAuto.getPrijsPerDag() * aantalDagen) / 100 * (100 - huurder.getKortingsPercentage());
    }

    @Override
    public String toString() {
        return  "\n" + gehuurdeAuto + "\n" +
                "\n" + huurder + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs + "\n";
    }

    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKortingsPercentage(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: " + ah1.toString());
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        ah1.totaalPrijs();
        System.out.println("Eerste autohuur:" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        ah2.totaalPrijs();
        System.out.println("Tweede autohuur: " + ah2.toString());

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }

}
