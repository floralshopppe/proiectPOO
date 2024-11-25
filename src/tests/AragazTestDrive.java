package tests;

import helper_classes.*;

public class AragazTestDrive {
    public static void main(String[] args) {

        // Creare instante de Aragaz
        Aragaz aragaz1 = new Aragaz();
        Aragaz aragaz2 = new Aragaz("Arctic", "GasMaster", 1000.0, 4, true, "Gaz", true);
        Aragaz aragaz3 = new Aragaz("Electrolux", "MixCook", 1800.0, 5, false, "Mixt", false);

        // Testare metode turnOn si turnOff
        aragaz1.turnOn();
        System.out.println(aragaz1);

        aragaz2.turnOff();
        System.out.println(aragaz2);

        aragaz3.turnOn();
        System.out.println(aragaz3);
    }
}
