package helper_classes;

public class CuptorCuMicrounde implements EchipamentBucatarie {
    // atribute specifice Cuptor Cu Microunde
    public String marca;
    public String model;
    public double pret;
    public String culoare;
    public int putere; // in wati
    public double capacitate; // in litri
    public boolean functieGrill;
    public boolean estePornit; // starea de functionare

    // constructor fara argumente
    public CuptorCuMicrounde() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 500.0;
        this.culoare = "Alb";
        this.putere = 800;
        this.capacitate = 20.0;
        this.functieGrill = false;
        this.estePornit = false;
    }

    // constructor cu toate argumentele
    public CuptorCuMicrounde(String marca, String model, double pret, String culoare,
                             int putere, double capacitate, boolean functieGrill) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.culoare = culoare;
        this.putere = putere;
        this.capacitate = capacitate;
        this.functieGrill = functieGrill;
        this.estePornit = false;
    }

    // implementare metoda turnOn
    @Override
    public void turnOn() {
        estePornit = true;
        System.out.println("Cuptorul cu microunde " + marca + " este acum pornit.");
    }

    // implementare metoda turnOff
    @Override
    public void turnOff() {
        estePornit = false;
        System.out.println("Cuptorul cu microunde " + marca + " este acum oprit.");
    }

    // implementare metoda toString
    @Override
    public String toString() {
        return "CuptorCuMicrounde [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Culoare=" + culoare + ", Putere=" + putere + "W, Capacitate=" + capacitate +
               "L, Functie Grill=" + functieGrill + ", Este Pornit=" + estePornit + "]";
    }
}