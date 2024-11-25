package tests;

import helper_classes.*;

public class TestEx3 {
    public static void main(String[] args) {
        // Vector de tip Object[] pentru Frigidere
        Object[] frigidere = new Object[10];
        for (int i = 0; i < frigidere.length; i++) {
            frigidere[i] = new Frigider("Frigider" + i, "Model" + i, 1500.0 + i * 100, 
                                         "Alb", "Plastic", 300 + i * 10, i % 2 == 0);
        }

        // Vector de tip Object[] pentru Combine
        Object[] combine = new Object[10];
        for (int i = 0; i < combine.length; i++) {
            combine[i] = new Combina("Combina" + i, "Model" + i, 2500.0 + i * 200, 
                                      200 + i * 10, 100 + i * 5, i % 2 == 0, 40 + i);
        }

        // Afișăm toate frigiderele
        System.out.println("Frigidere:");
        for (Object obj : frigidere) {
            System.out.println(obj.toString());
        }

        // Afișăm toate combinele
        System.out.println("\nCombine:");
        for (Object obj : combine) {
            System.out.println(obj.toString());
        }
    }
}
