package helper_classes;

public class Cafetiera implements EchipamentBucatarie {
    String marca;
    String model;
    double pret;
    String culoare;
    String material;
    int capacitateRezervorApa;
    int numarCestiMax;
    boolean estePornit;

    public Cafetiera() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 0;
        this.culoare = "Alb";
        this.material = "Plastic";
        this.capacitateRezervorApa = 0;
        this.numarCestiMax = 0;
        this.estePornit = false;
    }

    public Cafetiera(String marca, String model, double pret, String culoare, String material,
            int capacitateRezervorApa, int numarCestiMax) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.culoare = culoare;
        this.material = material;
        this.capacitateRezervorApa = capacitateRezervorApa;
        this.numarCestiMax = numarCestiMax;
        this.estePornit = false;
    }

    @Override
    public void turnOn() {
        estePornit = true;
        System.out.println("Cafetiera " + marca + " este acum pornita.");
    }

    @Override
    public void turnOff() {
        estePornit = false;
        System.out.println("Cafetiera " + marca + " este acum oprita.");
    }

    public void preparaCafea(int numarCesti) {
        if (!estePornit) {
            System.out.println("Cafetiera " + marca + " este oprita. Porniti-o inainte de utilizare.");
            return;
        }

        if (numarCesti > numarCestiMax) {
            System.out.println("Cafetiera " + marca + " poate prepara maximum " + numarCestiMax + " cesti de cafea.");
        } else {
            System.out.println("Cafetiera " + marca + " prepara " + numarCesti + " cesti de cafea.");
        }
    }

    @Override
    public String toString() {
        return "Cafetiera [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
                ", Culoare=" + culoare + ", Material=" + material +
                ", Capacitate Rezervor Apa=" + capacitateRezervorApa +
                ", Numar Cesti Max=" + numarCestiMax +
                ", Este Pornit=" + estePornit + "]";
    }
}
