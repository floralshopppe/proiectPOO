package helper_classes;

public class Aragaz implements EchipamentBucatarie {
    // Atribute specifice Aragaz
    public String marca;
    public String model;
    public double pret;
    public int numarArzatoare;
    public boolean aprindereElectrica;
    public String tipCombustibil; // Gaz, Electric, Mixt
    public boolean cuptorInclus;

    // Constructor fara argumente 
    public Aragaz() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 1200.0;
        this.numarArzatoare = 4;
        this.aprindereElectrica = true;
        this.tipCombustibil = "Gaz";
        this.cuptorInclus = true;
    }

    // Constructor cu toate argumentele
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

    // Implementare metoda turnOn
    @Override
    public void turnOn() {
        System.out.println("Aragazul " + marca + " este acum pornit.");
    }

    // Implementare metoda turnOff
    @Override
    public void turnOff() {
        System.out.println("Aragazul " + marca + " este acum oprit.");
    }

    // Implementare metoda toString
    @Override
    public String toString() {
        return "Aragaz [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Numar Arzatoare=" + numarArzatoare + ", Aprindere Electrica=" + aprindereElectrica +
               ", Tip Combustibil=" + tipCombustibil + ", Cuptor Inclus=" + cuptorInclus + "]";
    }
}
