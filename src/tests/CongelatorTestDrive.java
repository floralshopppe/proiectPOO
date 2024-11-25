package tests;

import helper_classes.*;

public class CongelatorTestDrive {
    public static void main(String[] args) {
        Congelator congelator1 = new Congelator();
        Congelator congelator2 = new Congelator("Samsung", -4, 200, -120, 160, "Alb", false, -1);
        Congelator congelator3 = new Congelator("Daewoo", 100, 200, 120, 160, "Alb", true, 1);
        Congelator[] array = { congelator1, congelator2, congelator3 };

        printObjects(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOn();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOff();
        }

        System.out.println("#" + 3 + " ");
        congelator3.turnOn();

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].racireRapida();
        }
    }

    public static void printObjects(Congelator[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}
