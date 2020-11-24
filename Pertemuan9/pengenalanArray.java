package com.pboreg;

import java.util.Arrays;

public class pengenalanArray {
    public static void main(String[] args) {
        // tipedata [] nama = {komponen-komponen}

        System.out.println("asssignment Array");

        int [] arrayInterger = {1,2,3,4};

        arrayInterger[0] = 11;

        System.out.println(arrayInterger[0]);
        System.out.println(arrayInterger[1]);
        System.out.println(arrayInterger[2]);
        System.out.println(arrayInterger[3]);
        System.out.println("\n");

        // deklarasi
        // tipedata[] nama = new int[jumlahArray];

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        System.out.println("\n");

        System.out.println(Arrays.toString(arrayInterger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
