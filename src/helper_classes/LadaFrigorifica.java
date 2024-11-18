package helper_classes;
public class LadaFrigorifica extends EchipamentRacire implements EchipamentBucatarie {
    private int numarCosuri;

    public LadaFrigorifica() {
        super();
        numarCosuri = 0;
    }

    public LadaFrigorifica(String marca, int latimeMilimetri, int inaltimeMilimetri, int adancimeMilimetri, int volumNetLitri,
            String culoareString, int numarCosuri) {
        super(marca, latimeMilimetri, inaltimeMilimetri, adancimeMilimetri, volumNetLitri, culoareString);
        this.numarCosuri = numarCosuri;
    }

    public LadaFrigorifica(LadaFrigorifica other) {
        super(other);
        numarCosuri = other.numarCosuri;
    }

    @Override
    public void turnOff() {
        System.out.println("Lada frigorifica a fost inchisa");
    }

    @Override
    public void turnOn() {
        System.out.println("Lada frigorifica a fost pornita");
    }

    @Override
    public String toString() {
        if (numarCosuri == 1) {
            return "Lada frigorifica marca " + getMarca() + ", culoarea " + getCuloare() + " are un cos, volumul net total de " + getVolumNet() + "L si dimensiunile " + getLatime() + "x"
                    + getInaltime() + "x"
                    + getAdancime() + "mm";

        } else {
            return "Lada frigorifica marca " + getMarca() + ", culoarea " + getCuloare() + " are " + getNumarCosuri()
                    + " cosuri, volumul net total de " + getVolumNet() + "L si dimensiunile " + getLatime() + "x"
                    + getInaltime() + "x"
                    + getAdancime() + "mm";
        }
    }

    public int getNumarCosuri() {
        return numarCosuri;
    }

    public void setNumarCosuri(int numarCosuri) {
        this.numarCosuri = numarCosuri;
    }

    @Override
    public void setTemperatura(int temp) {
        if (temp < -4 && temp > -30)
            temperatura = temp;
    }
}
