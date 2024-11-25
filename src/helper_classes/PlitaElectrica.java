package helper_classes;

public class PlitaElectrica implements EchipamentBucatarie {
    // Atribute specifice Plita Electrica
    String marca;
    String model;
    double pret;
    int numarZoneIncalzire;
    String tipControl; // Touch, Mecanic
    boolean functieBlocareCopii;
    int putereTotala; // in W

    // Constructor fara argumente
    public PlitaElectrica() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 800.0;
        this.numarZoneIncalzire = 4;
        this.tipControl = "Touch";
        this.functieBlocareCopii = true;
        this.putereTotala = 6000;
    }

    // Constructor cu toate argumentele
    public PlitaElectrica(String marca, String model, double pret, int numarZoneIncalzire,
                          String tipControl, boolean functieBlocareCopii, int putereTotala) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.numarZoneIncalzire = numarZoneIncalzire;
        this.tipControl = tipControl;
        this.functieBlocareCopii = functieBlocareCopii;
        this.putereTotala = putereTotala;
    }

    // Implementare metoda turnOn
    @Override
    public void turnOn() {
        System.out.println("Plita electrica " + marca + " este acum pornita.");
    }

    // Implementare metoda turnOff
    @Override
    public void turnOff() {
        System.out.println("Plita electrica " + marca + " este acum oprita.");
    }

    // Implementare metoda toString
    @Override
    public String toString() {
        return "PlitaElectrica [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Numar Zone Incalzire=" + numarZoneIncalzire + ", Tip Control=" + tipControl +
               ", Functie Blocare Copii=" + functieBlocareCopii + ", Putere Totala=" + putereTotala + "W]";
    }
}
