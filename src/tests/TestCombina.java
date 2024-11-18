package tests;

import helper_classes.*;

public class TestCombina {
    public static void main(String[] args) {
        
        // Creăm instanțe de Combina
        Combina combina1 = new Combina();
        Combina combina2 = new Combina("Bosch", "DualCool", 3000.0, 250, 100, true, 38);
        Combina combina3 = new Combina("Whirlpool", "ArcticMax", 3500.0, 300, 150, false, 42);

        
        // Testăm metodele turnOn și turnOff pentru combine
        combina1.turnOn();
        System.out.println(combina1);

        combina2.turnOff();
        System.out.println(combina2);

        combina3.turnOn();
        System.out.println(combina3);
    }
}
