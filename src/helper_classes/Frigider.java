package helper_classes;
public class Frigider implements EchipamentBucatarie {
    // Atribute specifice Frigider
    String marca;
    String model;
    double pret;
    String culoare;
    String material;
    int capacitateLitri;
    boolean sistemNoFrost;
    boolean estePornit; // Starea de funcționare

    // Constructor fără argumente
    public Frigider() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 0;
        this.culoare = "Alb";
        this.material = "Plastic";
        this.capacitateLitri = 0;
        this.sistemNoFrost = true;
        this.estePornit = false;
    }

    // Constructor cu toate argumentele
    public Frigider(String marca, String model, double pret, String culoare, String material,
                    int capacitateLitri, boolean sistemNoFrost) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.culoare = culoare;
        this.material = material;
        this.capacitateLitri = capacitateLitri;
        this.sistemNoFrost = sistemNoFrost;
        this.estePornit = false;
    }

    // Implementare metodă turnOn
    @Override
    public void turnOn() {
        estePornit = true;
        System.out.println("Frigiderul " + marca + " este acum pornit.");
    }

    // Implementare metodă turnOff
    @Override
    public void turnOff() {
        estePornit = false;
        System.out.println("Frigiderul " + marca + " este acum oprit.");
    }

    // Implementare metodă toString
    @Override
    public String toString() {
        return "Frigider [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
               ", Culoare=" + culoare + ", Material=" + material +
               ", Capacitate Litri=" + capacitateLitri + ", Sistem NoFrost=" + sistemNoFrost +
               ", Este Pornit=" + estePornit + "]";
    }
}

