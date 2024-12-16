package helper_classes;

public class Aragaz implements EchipamentBucatarie {
    public String marca;
    public String model;
    public double pret;
    public int numarArzatoare;
    public boolean aprindereElectrica;
    public String tipCombustibil;
    public boolean cuptorInclus;

    public Aragaz() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 1200.0;
        this.numarArzatoare = 4;
        this.aprindereElectrica = true;
        this.tipCombustibil = "Gaz";
        this.cuptorInclus = true;
    }

    public Aragaz(String marca, String model, double pret, int numarArzatoare,
                  boolean aprindereElectrica, String tipCombustibil, boolean cuptorInclus) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.numarArzatoare = numarArzatoare;
        this.aprindereElectrica = aprindereElectrica;
        this.tipCombustibil = tipCombustibil;
        this.cuptorInclus = cuptorInclus;
    }

    @Override
    public void turnOn() {
        System.out.println("Aragazul " + marca + " este acum pornit.");
    }

    @Override
    public void turnOff() {
        System.out.println("Aragazul " + marca + " este acum oprit.");
    }

    @Override
    public String toString() {
        return "Aragaz [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Numar Arzatoare=" + numarArzatoare + ", Aprindere Electrica=" + aprindereElectrica +
               ", Tip Combustibil=" + tipCombustibil + ", Cuptor Inclus=" + cuptorInclus + "]";
    }
}
