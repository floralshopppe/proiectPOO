package tests;

import helper_classes.*;

public class CafetieraTestDrive {
    public static void main(String[] args) {
        Cafetiera cafetiera1 = new Cafetiera();
        Cafetiera cafetiera2 = new Cafetiera("Tefal", "EasyBrew", 299.99, "Negru", "Plastic", 1200, 10);
        Cafetiera cafetiera3 = new Cafetiera("Bosch", "ComfortLine", 399.99, "Rosu", "Metal", 1500, 12);
        Cafetiera[] array = { cafetiera1, cafetiera2, cafetiera3 };

        printObjects(array);

        cafetiera2.turnOn();
        cafetiera2.preparaCafea(5);
        cafetiera3.turnOn();
        cafetiera3.preparaCafea(15);
        cafetiera3.preparaCafea(8);
        cafetiera3.turnOff();
    }

    public static void printObjects(Cafetiera[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}
