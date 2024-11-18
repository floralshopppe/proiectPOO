package tests;

import helper_classes.*;

public class TestCuptorCuMicrounde {
    public static void main(String[] args) {
        // Cream instante de CuptorCuMicrounde
        CuptorCuMicrounde microunde1 = new CuptorCuMicrounde();
        CuptorCuMicrounde microunde2 = new CuptorCuMicrounde("Samsung", "GrillPro", 700.0, "Negru", 900, 25.0, true);
        CuptorCuMicrounde microunde3 = new CuptorCuMicrounde("LG", "CompactWave", 600.0, "Alb", 800, 20.0, false);

        // Testam metodele turnOn si turnOff pentru cuptoare cu microunde
        microunde1.turnOn();
        System.out.println(microunde1);

        microunde2.turnOff();
        System.out.println(microunde2);

        microunde3.turnOn();
        System.out.println(microunde3);
    }
}