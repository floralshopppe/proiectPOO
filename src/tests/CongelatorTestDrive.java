package tests;

import helper_classes.*;

public class CongelatorTestDrive {
    public static void main(String[] args) {
        /*
         * 
         * Congelator congelator0 = new Congelator();
         * Congelator congelator1 = new Congelator("Samsung", -4, 200, -120, 160, "Alb",
         * false, -1);
         * Congelator congelator2 = new Congelator("Daewoo", 100, 200, 120, 160, "Alb",
         * true, 1);
         * Congelator congelator3 = new Congelator(congelator2);
         * Congelator[] array = {congelator0, congelator1, congelator2, congelator3};
         * printObjects(array);
         * System.out.println();
         * 
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("#" + i + " ");
         * array[i].turnOn();
         * }
         * System.out.println();
         * 
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("#" + i + " ");
         * array[i].turnOff();
         * }
         * System.out.println();
         * 
         * System.out.println("#" + 3 + " ");
         * congelator3.turnOn();
         * System.out.println();
         * 
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("#" + i + " ");
         * array[i].racireRapida();
         * }
         * System.out.println();
         */

        Congelator[] congelatorArray = new Congelator[10];
        for (int i = 0; i < congelatorArray.length; i++) {
            congelatorArray[i] = new Congelator("Daewoo", i * 100, i * 150, i * 200, i * 100, "Alb", true, i);
        }
        printObjects(congelatorArray);

        int latime = 350;
        int adancime = 250;

        System.out.println("Obiecte cu latimea sub " + latime + "mm si adancimea sub " + adancime + "mm :");
        for (int i = 0; i < congelatorArray.length; i++) {
            if (congelatorArray[i].getLatime() < latime && congelatorArray[i].getAdancime() < adancime) {
                System.out.println(congelatorArray[i].toString());
            }
        }
    }

    public static void printObjects(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}
