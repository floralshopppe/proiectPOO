package tests;

import helper_classes.*;

public class AfisareConditionalaElectrocasniceTestDrive {
    public static void main(String[] args) {
        // Cream vectorul de Aragazuri
        Aragaz[] aragazuri = new Aragaz[5];
        for (int i = 0; i < aragazuri.length; i++) {
            aragazuri[i] = new Aragaz("MarcaAragaz" + i, "Model" + i, 1500.0f + i * 100, 
                                      4, i % 2 == 0, "Gaz", i % 2 == 1);
        }

        // Cream vectorul de Plite Electrice
        PlitaElectrica[] pliteElectrice = new PlitaElectrica[5];
        for (int i = 0; i < pliteElectrice.length; i++) {
            pliteElectrice[i] = new PlitaElectrica("MarcaPlita" + i, "Model" + i, 2000.0f + i * 200, 
                                                   4 + i, "Tactil", i % 2 == 0, 7000 + i * 500);
        }

        // Afisam aragazurile care indeplinesc conditiile
        System.out.println("Aragazuri care indeplinesc conditiile:");
        for (Aragaz aragaz : aragazuri) {
            if (aragaz.pret < 1600.0 && aragaz.numarArzatoare >= 4) {
                System.out.println(aragaz);
            }
        }

        // Afisam plitele electrice care indeplinesc conditiile
        System.out.println("\nPlite Electrice care indeplinesc conditiile:");
        for (PlitaElectrica plita : pliteElectrice) {
            if (plita.pret < 2500.0 ) {
                System.out.println(plita);
            }
        }
    }
}
