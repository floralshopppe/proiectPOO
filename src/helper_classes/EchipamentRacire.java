package helper_classes;
public abstract class EchipamentRacire {
    private String marca;
    private int latime;
    private int inaltime;
    private int adancime;
    private int volumNet;
    private String culoare;
    protected int temperatura;
    protected static int idEchipamentRacire = 0;

    public EchipamentRacire() {
        marca = "necunoscut";
        culoare = "necunoscut";
        temperatura = -4;
        idEchipamentRacire++;
    }

    public EchipamentRacire(String marcaString, int latimeMilimetri, int inaltimeMilimetri, int adancimeMilimetri,
            int volumNetLitri, String culoareString) {
        if (marcaString.isBlank() || marcaString.isEmpty()) {
            marca = "necunoscut";
        } else {
            marca = marcaString.toLowerCase();
        }
        if (latimeMilimetri < 0) {
            System.err.println("#" + idEchipamentRacire + " Latime incorecta");
            latime = 0;
        } else {
            latime = latimeMilimetri;
        }
        if (inaltimeMilimetri < 0) {
            System.err.println("#" + idEchipamentRacire + " Inaltime incorecta");
            inaltime = 0;
        } else {
            inaltime = inaltimeMilimetri;
        }
        if (adancimeMilimetri < 0) {
            System.err.println("#" + idEchipamentRacire + " Adancime incorecta");
            adancime = 0;
        } else {
            adancime = adancimeMilimetri;
        }
        if (volumNetLitri < 0) {
            System.err.println("#" + idEchipamentRacire + " Volum incorect");
            volumNet = 0;
        } else {
            volumNet = volumNetLitri;
        }

        if (culoareString.isBlank() || culoareString.isEmpty()) {
            culoare = "necunoscut";
        } else {
            culoare = culoareString.toLowerCase();
        }
    }

    public EchipamentRacire(EchipamentRacire other) {
        marca = other.marca;
        adancime = other.adancime;
        latime = other.latime;
        inaltime = other.inaltime;
        volumNet = other.volumNet;
        culoare = other.culoare;
    }

    public String getMarca() {
        return marca;
    }

    public int getAdancime() {
        return adancime;
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getVolumNet() {
        return volumNet;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public static int getIdEchipamentRacire() {
        return idEchipamentRacire;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAdancime(int adancime) {
        this.adancime = adancime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setVolumNet(int volumNet) {
        this.volumNet = volumNet;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public static void setIdEchipamentRacire(int idEchipamentRacire) {
        EchipamentRacire.idEchipamentRacire = idEchipamentRacire;
    }

    public abstract void setTemperatura(int temp);
}
