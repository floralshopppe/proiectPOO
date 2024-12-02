package tests;

import helper_classes.*;

public class AfisareEchipamenteBucatarie {
    public static void main(String[] args) {
        // Cream vectorul de Frigidere
        Frigider[] frigidere = new Frigider[5];
        for (int i = 0; i < frigidere.length; i++) {
            frigidere[i] = new Frigider("Frigider" + i, "Model" + i, 1500.0 + i * 100, 
                                         "Alb", "Plastic", 300 + i * 10, i % 2 == 0);
        }

        // Cream vectorul de Combine
        Combina[] combine = new Combina[5];
        for (int i = 0; i < combine.length; i++) {
            combine[i] = new Combina("Combina" + i, "Model" + i, 2500.0 + i * 200, 
                                      200 + i * 10, 100 + i * 5, i % 2 == 0, 40 + i);
        }

        // Afisam frigiderele care indeplinesc conditiile
        System.out.println("Frigidere care indeplinesc conditiile:");
        for (Frigider frigider : frigidere) {
            if (frigider.capacitateLitri > 320 && frigider.sistemNoFrost) {
                System.out.println(frigider);
            }
        }

        // Afisam combinele care indeplinesc conditiile
        System.out.println("\nCombine care indeplinesc conditiile:");
        for (Combina combina : combine) {
            if (combina.capacitateFrigider > 220 && combina.functieSuperFreeze) {
                System.out.println(combina);
            }
        }

        // Afisam echipamentele bucatarie care indeplinesc conditiile
        System.out.println("\nEchipamente care indeplinesc conditiile:");
        for (Frigider frigider : frigidere) {
            if (frigider.capacitateLitri > 320 && frigider.sistemNoFrost) {
                System.out.println(frigider);
            }
        }
        for (Combina combina : combine) {
            if (combina.capacitateFrigider > 220 && combina.functieSuperFreeze) {
                System.out.println(combina);
            }
        }
    }
}
