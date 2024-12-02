package tests;

import helper_classes.*;

public class AfisareConditionala {
    public static void main(String[] args) {
        // Cream vectorul de Cuptoare Incorporabile
        CuptorIncorporabil[] cuptoareIncorporabile = new CuptorIncorporabil[5];
        for (int i = 0; i < cuptoareIncorporabile.length; i++) {
            cuptoareIncorporabile[i] = new CuptorIncorporabil("CuptorIncorporabil" + i, "Model" + i, 1500.0 + i * 100, 
                                         70 + i * 10, 10 + i, i % 2 == 0, "A+");
        }

        // Cream vectorul de Cuptoare cu Microunde
        CuptorCuMicrounde[] cuptoareCuMicrounde = new CuptorCuMicrounde[5];
        for (int i = 0; i < cuptoareCuMicrounde.length; i++) {
            cuptoareCuMicrounde[i] = new CuptorCuMicrounde("CuptorMicrounde" + i, "Model" + i, 500.0 + i * 50, 
                                         "Alb", 800 + i * 100, 20.0 + i * 5, i % 2 == 0);
        }

        // Afisam cuptoarele incorporabile care indeplinesc conditiile
        System.out.println("Cuptoare Incorporabile care indeplinesc conditiile:");
        for (CuptorIncorporabil cuptor : cuptoareIncorporabile) {
            if (cuptor.pret < 1600.0 && cuptor.capacitate >= 80) {
                System.out.println(cuptor);
            }
        }

        // Afisam cuptoarele cu microunde care indeplinesc conditiile
        System.out.println("\nCuptoare cu Microunde care indeplinesc conditiile:");
        for (CuptorCuMicrounde cuptor : cuptoareCuMicrounde) {
            if (cuptor.pret < 600.0 && cuptor.capacitate >= 25.0) {
                System.out.println(cuptor);
            }
        }
    }
}