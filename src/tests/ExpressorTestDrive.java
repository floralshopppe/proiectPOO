package tests;

import helper_classes.*;

public class ExpressorTestDrive {
    public static void main(String[] args) {
        Expressor expressor1 = new Expressor();
        Expressor expressor2 = new Expressor("DeLonghi", "Magnifica", 1200.99, "Negru", "Metal", 1500, true);
        Expressor expressor3 = new Expressor("Philips", "LatteGo", 999.99, "Alb", "Plastic", 1800, false);
        Expressor[] array = { expressor1, expressor2, expressor3 };

        printObjects(array);

        expressor2.turnOn();
        expressor2.preparaCafea();
        expressor3.turnOn();
        expressor3.preparaCafea();
        expressor3.turnOff();
    }

    public static void printObjects(Expressor[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}
