package tests;

import helper_classes.*;

public class LadaFrigorificaTestDrive {
    public static void main(String[] args) {
        LadaFrigorifica ladaFrigo1 = new LadaFrigorifica();
        LadaFrigorifica ladaFrigo2 = new LadaFrigorifica("Samsung", 120, 200, 120, 160, "Alb", false,-4);
        LadaFrigorifica ladaFrigo3 = new LadaFrigorifica("Daewoo", 100, 150, 100, 160, "Negru", true,2);
        LadaFrigorifica[] array = { ladaFrigo1, ladaFrigo2, ladaFrigo3 };
        printObjects(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOn();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOff();
        }
    }

    public static void printObjects(LadaFrigorifica[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}