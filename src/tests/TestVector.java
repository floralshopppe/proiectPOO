package tests;

import helper_classes.CuptorCuMicrounde;
import helper_classes.CuptorIncorporabil;

public class TestVector {
    public static void main(String[] args) {
        // Cream un vector de tip Object[] pentru CuptorCuMicrounde
        Object[] cuptoareMicrounde = new Object[10];
        for (int i = 0; i < cuptoareMicrounde.length; i++) {
            cuptoareMicrounde[i] = new CuptorCuMicrounde(
                    "MarcaMicrounde" + i, 
                    "ModelMicrounde" + i, 
                    300.0 + i * 50, 
                    "Culoare" + i, 
                    700 + i * 50, 
                    18.0 + i, 
                    i % 2 == 0
            );
        }

        // Afisam toate cuptoarele cu microunde
        System.out.println("Cuptoare Cu Microunde:");
        for (Object obj : cuptoareMicrounde) {
            System.out.println(obj.toString());
        }

        // Cream un vector de tip Object[] pentru CuptorIncorporabil
        Object[] cuptoareIncorporabile = new Object[10];
        for (int i = 0; i < cuptoareIncorporabile.length; i++) {
            cuptoareIncorporabile[i] = new CuptorIncorporabil(
                    "MarcaIncorporabil" + i, 
                    "ModelIncorporabil" + i, 
                    1200.0 + i * 100, 
                    60 + i * 5, 
                    10 + i, 
                    i % 2 == 0, 
                    "A" + (i % 2 == 0 ? "+" : "")
            );
        }

        // Afisam toate cuptoarele incorporabile
        System.out.println("\nCuptoare Incorporabile:");
        for (Object obj : cuptoareIncorporabile) {
            System.out.println(obj.toString());
        }
    }
}