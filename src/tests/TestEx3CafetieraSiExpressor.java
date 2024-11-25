package tests;

import helper_classes.*;

public class TestEx3CafetieraSiExpressor {
    public static void main(String[] args) {
        Object[] espressoare = new Object[10];
        for (int i = 0; i < espressoare.length; i++) {
            espressoare[i] = new Expressor("Expressor" + i, "Model" + i, 800.0 + i * 50,
                    "Negru", "Metal", 15 + i, i % 2 == 0);
        }

        Object[] cafetiere = new Object[10];
        for (int i = 0; i < cafetiere.length; i++) {
            cafetiere[i] = new Cafetiera("Cafetiera" + i, "Model" + i, 500.0 + i * 30,
                    "Alb", "Plastic", 1 + i, 4 + i);
        }

        System.out.println("Espresoare:");
        for (Object obj : espressoare) {
            System.out.println(obj.toString());
        }

        System.out.println("\nCafetiere:");
        for (Object obj : cafetiere) {
            System.out.println(obj.toString());
        }
    }
}
