package helper_classes;

public class LadaFrigorifica extends EchipamentRacire implements EchipamentBucatarie {
    private int numarCosuri;
    private static int idLadaFrigo = 0;

    public LadaFrigorifica() {
        super();
        numarCosuri = 0;
        idLadaFrigo++;
    }

    public LadaFrigorifica(String marca, int latimeMilimetri, int inaltimeMilimetri, int adancimeMilimetri,
            int volumNetLitri,
            String culoareString, boolean isOn, int numarCosuri) {
        super(marca, latimeMilimetri, inaltimeMilimetri, adancimeMilimetri, volumNetLitri, culoareString, isOn);
        this.numarCosuri = numarCosuri;
        idLadaFrigo++;
    }

    public LadaFrigorifica(LadaFrigorifica other) {
        super(other);
        numarCosuri = other.numarCosuri;
        isOn = other.isOn;
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Lada frigorifica a fost inchisa");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Lada frigorifica a fost pornita");
    }

    @Override
    public String toString() {
        if (numarCosuri == 1) {
            return "Lada frigorifica marca " + getMarca() + ", culoarea " + getCuloare()
                    + " are un cos, volumul net total de " + getVolumNet() + "L si dimensiunile " + getLatime() + "x"
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

    public static int getIdLadaFrigo() {
        return idLadaFrigo;
    }

    public void setNumarCosuri(int numarCosuri) {
        this.numarCosuri = numarCosuri;
    }

    public static void setIdLadaFrigo(int idLadaFrigo) {
        LadaFrigorifica.idLadaFrigo = idLadaFrigo;
    }

    @Override
    public void setTemperatura(int temp) {
        if (temp < -4 && temp > -30)
            temperatura = temp;
    }
}
