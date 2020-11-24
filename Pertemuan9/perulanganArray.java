package com.pboreg;

import java.util.Arrays;

public class perulanganArray {

    public static void main(String[] args) {

        int [] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        //looping standard
        System.out.println("\nLooping Standard");
        for(int i = 0; i<10; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        //looping dengan properti array
        System.out.println("\nLooping dengan properti length");
        for(int i = 0; i<arrayAngka.length; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        //looping khususan untuk collection <- array
        System.out.println("\nlooping for each");
        for( int array:arrayAngka){
            System.out.println("angka pada looping ini adalah : " + array);
        }
    }
}
