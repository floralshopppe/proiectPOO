package tests;

import helper_classes.*;

public class LadaFrigorificaTestDrive {
    public static void main(String[] args) {
        /*
         * 
         * LadaFrigorifica ladaFrigo0 = new LadaFrigorifica();
         * LadaFrigorifica ladaFrigo1 = new LadaFrigorifica("Samsung", 120, 200, 120,
         * 160, "Alb", false, -4);
         * LadaFrigorifica ladaFrigo2 = new LadaFrigorifica("Daewoo", 100, 150, 100,
         * 160, "Negru", true, 2);
         * LadaFrigorifica ladaFrigo3 = new LadaFrigorifica(ladaFrigo2);
         * LadaFrigorifica[] array = { ladaFrigo0, ladaFrigo1, ladaFrigo2, ladaFrigo3};
         * printObjects(array);
         * System.out.println();
         * 
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("#" + i + " ");
         * array[i].turnOn();
         * }
         * System.out.println();
         * 
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("#" + i + " ");
         * array[i].turnOff();
         * }
         * System.out.println();
         */

        LadaFrigorifica[] LadaFrigoArray = new LadaFrigorifica[10];
        for (int i = 0; i < LadaFrigoArray.length; i++) {
            LadaFrigoArray[i] = new LadaFrigorifica("Samsung", i * 100, i * 150, i * 200,
                    i * i * i * 100 * 150 * 200 / 1000000, "Alb", false, i);

        }
        printObjects(LadaFrigoArray);
        int inaltime = 600;
        int volum = 400;
        System.out.println("Obiecte cu inaltimea sub " + inaltime + "mm si volum sub " + volum + "L :");
        for (int i = 0; i < LadaFrigoArray.length; i++) {
            if (LadaFrigoArray[i].getInaltime() < inaltime && LadaFrigoArray[i].getVolumNet() < volum) {
                System.out.println(LadaFrigoArray[i].toString());
            }
        }
    }

    public static void printObjects(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " " + array[i].toString());
        }
    }
}