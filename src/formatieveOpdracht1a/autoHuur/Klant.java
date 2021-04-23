package formatieveOpdracht1a.autoHuur;

public class Klant {
    private String name;
    private double kortingsPercentage;

    public Klant(String name) {
        this.name = name;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return  "Op naam van: " + name +
                " (korting:" + kortingsPercentage + "%)";
    }
}
