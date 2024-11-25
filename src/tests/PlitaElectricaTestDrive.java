package tests;

import helper_classes.*;

public class PlitaElectricaTestDrive {
    public static void main(String[] args) {
        
        // Creare instante de PlitaElectrica
        PlitaElectrica plita1 = new PlitaElectrica();
        PlitaElectrica plita2 = new PlitaElectrica("Samsung", "FlexZone", 1500.0, 4, "Touch", true, 7200);
        PlitaElectrica plita3 = new PlitaElectrica("Bosch", "SmartHeat", 2000.0, 5, "Mecanic", false, 8000);

        // Testare metode turnOn si turnOff
        plita1.turnOn();
        System.out.println(plita1);

        plita2.turnOff();
        System.out.println(plita2);

        plita3.turnOn();
        System.out.println(plita3);
    }
}
