package helper_classes;

public class CuptorCuMicrounde implements EchipamentBucatarie {
    // Atribute specifice Cuptor Cu Microunde
    String marca;
    String model;
    double pret;
    String culoare;
    int putere; // în wați
    double capacitate; // în litri
    boolean functieGrill;
    boolean estePornit; // Starea de funcționare

    // Constructor fără argumente
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

    // Constructor cu toate argumentele
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

    // Implementare metodă turnOn
    @Override
    public void turnOn() {
        estePornit = true;
        System.out.println("Cuptorul cu microunde " + marca + " este acum pornit.");
    }

    // Implementare metodă turnOff
    @Override
    public void turnOff() {
        estePornit = false;
        System.out.println("Cuptorul cu microunde " + marca + " este acum oprit.");
    }

    // Implementare metodă toString
    @Override
    public String toString() {
        return "CuptorCuMicrounde [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Culoare=" + culoare + ", Putere=" + putere + "W, Capacitate=" + capacitate +
               "L, Functie Grill=" + functieGrill + ", Este Pornit=" + estePornit + "]";
    }
}