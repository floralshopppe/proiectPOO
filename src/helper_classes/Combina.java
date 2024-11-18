package helper_classes;

public class Combina implements EchipamentBucatarie {
    // Atribute specifice Combina
    String marca;
    String model;
    double pret;
    int capacitateFrigider;
    int capacitateCongelator;
    boolean functieSuperFreeze;
    int nivelZgomot;

    // Constructor fără argumente
    public Combina() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 2500.0;
        this.capacitateFrigider = 250;
        this.capacitateCongelator = 100;
        this.functieSuperFreeze = true;
        this.nivelZgomot = 40;
    }

    // Constructor cu toate argumentele
    public Combina(String marca, String model, double pret, int capacitateFrigider,
                              int capacitateCongelator, boolean functieSuperFreeze, int nivelZgomot) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.capacitateFrigider = capacitateFrigider;
        this.capacitateCongelator = capacitateCongelator;
        this.functieSuperFreeze = functieSuperFreeze;
        this.nivelZgomot = nivelZgomot;
    }

    // Implementare metodă turnOn
    @Override
    public void turnOn() {
        System.out.println("Combina " + marca + " este acum pornita.");
    }

    // Implementare metodă turnOff
    @Override
    public void turnOff() {
        System.out.println("Combina " + marca + " este acum oprita.");
    }

    // Implementare metodă toString
    @Override
    public String toString() {
        return "Combina [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Capacitate Frigider=" + capacitateFrigider +
               ", Capacitate Congelator=" + capacitateCongelator +
               ", Functie SuperFreeze=" + functieSuperFreeze +
               ", Nivel Zgomot=" + nivelZgomot + "]";
    }
}
