package tests;

import helper_classes.*;

public class LadaFrigorificaTestDrive {
    public static void main(String[] args) {
        LadaFrigorifica ladaFrigo0 = new LadaFrigorifica();
        LadaFrigorifica ladaFrigo1 = new LadaFrigorifica("Samsung", 120, 200, 120, 160, "Alb", false, -4);
        LadaFrigorifica ladaFrigo2 = new LadaFrigorifica("Daewoo", 100, 150, 100, 160, "Negru", true, 2);
        LadaFrigorifica ladaFrigo3 = new LadaFrigorifica(ladaFrigo2);
        LadaFrigorifica[] array = { ladaFrigo0, ladaFrigo1, ladaFrigo2, ladaFrigo3};
        printObjects(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOn();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " ");
            array[i].turnOff();
        }
        System.out.println();

        Object[] LadaFrigoArray = new Object[10];
        for (int i = 0; i < LadaFrigoArray.length; i++) {
            LadaFrigoArray[i] = new LadaFrigorifica("Samsung", i, i, i, i, "Alb", false, i);

        }
        printObjects(LadaFrigoArray);
    }

    public static void printObjects(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}