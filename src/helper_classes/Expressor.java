package helper_classes;

public class Expressor implements EchipamentBucatarie {
    String marca;
    String model;
    double pret;
    String culoare;
    String material;
    int capacitateRezervorApa;
    boolean areSpumareLapte;
    boolean estePornit;

    public Expressor() {
        this.marca = "Default";
        this.model = "Standard";
        this.pret = 0;
        this.culoare = "Negru";
        this.material = "Plastic";
        this.capacitateRezervorApa = 0;
        this.areSpumareLapte = false;
        this.estePornit = false;
    }

    public Expressor(String marca, String model, double pret, String culoare, String material,
            int capacitateRezervorApa, boolean areSpumareLapte) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.culoare = culoare;
        this.material = material;
        this.capacitateRezervorApa = capacitateRezervorApa;
        this.areSpumareLapte = areSpumareLapte;
        this.estePornit = false;
    }

    @Override
    public void turnOn() {
        estePornit = true;
        System.out.println("Expressorul " + marca + " este acum pornit.");
    }

    @Override
    public void turnOff() {
        estePornit = false;
        System.out.println("Expressorul " + marca + " este acum oprit.");
    }

    public void preparaCafea() {
        if (estePornit) {
            System.out.println("Expressorul " + marca + " prepară cafea...");
        } else {
            System.out.println("Expressorul " + marca + " este oprit. Porniti-l înainte de utilizare.");
        }
    }

    @Override
    public String toString() {
        return "Expressor [Marca=" + marca + ", Model=" + model + ", Pret=" + pret +
                ", Culoare=" + culoare + ", Material=" + material +
                ", Capacitate Rezervor Apa=" + capacitateRezervorApa + ", Are Spumare Lapte=" + areSpumareLapte +
                ", Este Pornit=" + estePornit + "]";
    }
}
