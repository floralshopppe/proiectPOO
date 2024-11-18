package tests;

import helper_classes.*;

public class TestCuptorIncorporabil {
    public static void main(String[] args) {
        // Cream instante de CuptorIncorporabil
        CuptorIncorporabil incorporabil1 = new CuptorIncorporabil();
        CuptorIncorporabil incorporabil2 = new CuptorIncorporabil("Bosch", "SmartBake", 2000.0, 75, 12, true, "A++");
        CuptorIncorporabil incorporabil3 = new CuptorIncorporabil("Whirlpool", "MaxHeat", 1800.0, 65, 10, false, "A");

        // Testam metodele turnOn si turnOff pentru cuptoare incorporabile
        incorporabil1.turnOn();
        System.out.println(incorporabil1);

        incorporabil2.turnOff();
        System.out.println(incorporabil2);

        incorporabil3.turnOn();
        System.out.println(incorporabil3);
    }
}
