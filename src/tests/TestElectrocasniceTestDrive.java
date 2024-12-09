package tests;

import helper_classes.*;

public class TestElectrocasniceTestDrive {
    public static void main(String[] args) {
        // Vector de tip Object[] pentru Aragazuri
        Object[] aragazuri = new Object[5];
        for (int i = 0; i < aragazuri.length; i++) {
            aragazuri[i] = new Aragaz("MarcaAragaz" + i, "Model" + i, 1500.0f + i * 100, 
                                      4, i % 2 == 0, "Gaz", i % 2 == 1);
        }

        // Vector de tip Object[] pentru Plite Electrice
        Object[] plite = new Object[5];
        for (int i = 0; i < plite.length; i++) {
            plite[i] = new PlitaElectrica("MarcaPlita" + i, "Model" + i, 2000.0f + i * 200, 
                                          4 + i, "Tactil", i % 2 == 0, 7000 + i * 500);
        }

        // Afișăm toate aragazurile
        System.out.println("Aragazuri:");
        for (Object obj : aragazuri) {
            System.out.println(obj.toString());
        }

        // Afișăm toate plitele electrice
        System.out.println("\nPlite Electrice:");
        for (Object obj : plite) {
            System.out.println(obj.toString());
        }
    }
}
