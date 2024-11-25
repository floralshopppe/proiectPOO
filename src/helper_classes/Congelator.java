package helper_classes;

public class Congelator extends EchipamentRacire implements EchipamentBucatarie {
    private int numarUsi;
    private static int idCongelator = 0;

    public Congelator() {
        super();
        numarUsi = 1;
        idCongelator++;
    }

    public Congelator(String marca, int latimeMilimetri, int inaltimeMilimetri, int adancimeMilimetri,
            int volumNetLitri,
            String culoareString, boolean isOn, int numarUsi) {
        super(marca, latimeMilimetri, inaltimeMilimetri, adancimeMilimetri, volumNetLitri, culoareString, isOn);
        if (numarUsi < 1) {
            this.numarUsi = 1;
        } else {
            this.numarUsi = numarUsi;
        }
        idCongelator++;
    }

    public Congelator(Congelator other) {
        super(other);
        numarUsi = other.numarUsi;
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Congelatorul a fost inchis");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Congelatorul a fost pornit");
    }

    public void racireRapida() {
        if (isOn == false) {

            this.turnOn();
        }
        System.out.println("Congelatorul a activat modul racire rapida pentru 20 de min");

    }

    @Override
    public String toString() {
        if (numarUsi == 1) {
            return "Congelatorul marca " + getMarca() + ", culoarea " + getCuloare()
                    + " are o usa, volumul net total de " + getVolumNet() + "L si dimensiunile " + getLatime() + "x"
                    + getInaltime() + "x"
                    + getAdancime() + "mm";
        } else {

            return "Congelatorul marca " + getMarca() + ", culoarea " + getCuloare() + " are " + getNumarUsi()
                    + " usi, volumul net total de " + getVolumNet() + "L si dimensiunile " + getLatime() + "x"
                    + getInaltime() + "x"
                    + getAdancime() + "mm";
        }
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public static int getIdCongelator() {
        return idCongelator;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public static void setIdCongelator(int idCongelator) {
        Congelator.idCongelator = idCongelator;
    }

    @Override
    public void setTemperatura(int temp) {
        if (temp < 0 && temp > -20)
            temperatura = temp;
    }

}
