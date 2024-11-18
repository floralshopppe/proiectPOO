package tests;

import helper_classes.*;

public class TestFrigider {
    public static void main(String[] args) {
        // Creăm instanțe de Frigider
        Frigider frigider1 = new Frigider();
        Frigider frigider2 = new Frigider("Samsung", "FrostFree", 2000.0, "Argintiu", "Inox", 350, true);
        Frigider frigider3 = new Frigider("LG", "EcoCool", 1800.0, "Alb", "Plastic", 300, false);

        

        // Testăm metodele turnOn și turnOff pentru frigidere
        frigider1.turnOn();
        System.out.println(frigider1);

        frigider2.turnOff();
        System.out.println(frigider2);

        frigider3.turnOn();
        System.out.println(frigider3);

     
    }
}
