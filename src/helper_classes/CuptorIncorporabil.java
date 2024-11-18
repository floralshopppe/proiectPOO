package helper_classes;

public class CuptorIncorporabil implements EchipamentBucatarie {
    // Atribute specifice Cuptor Incorporabil
    String marca;
    String model;
    double pret;
    int capacitate; // în litri
    int numarPrograme;
    boolean functieAutocuratare;
    String clasaEnergetica;

    // Constructor fără argumente
    public CuptorIncorporabil() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 1500.0;
        this.capacitate = 70;
        this.numarPrograme = 10;
        this.functieAutocuratare = true;
        this.clasaEnergetica = "A+";
    }

    // Constructor cu toate argumentele
    public CuptorIncorporabil(String marca, String model, double pret, int capacitate,
                              int numarPrograme, boolean functieAutocuratare, String clasaEnergetica) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.capacitate = capacitate;
        this.numarPrograme = numarPrograme;
        this.functieAutocuratare = functieAutocuratare;
        this.clasaEnergetica = clasaEnergetica;
    }

    // Implementare metodă turnOn
    @Override
    public void turnOn() {
        System.out.println("Cuptorul incorporabil " + marca + " este acum pornit.");
    }

    // Implementare metodă turnOff
    @Override
    public void turnOff() {
        System.out.println("Cuptorul incorporabil " + marca + " este acum oprit.");
    }

    // Implementare metodă toString
    @Override
    public String toString() {
        return "CuptorIncorporabil [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Capacitate=" + capacitate + "L, Numar Programe=" + numarPrograme +
               ", Functie Autocuratare=" + functieAutocuratare +
               ", Clasa Energetica=" + clasaEnergetica + "]";
    }
}
