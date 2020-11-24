package com.pboreg;

import java.util.ArrayList;

import java.util.*;

class alCari {

    private ArrayList<Integer> bilangan = new ArrayList<Integer>();

    public void setBilangan(int angka){
        this.bilangan.add(angka);
    }

    public void print(){
        System.out.println("==================================================");
        System.out.println("\tBerikut merupakan data yang telah anda input");
        System.out.println("==================================================");
        for(Integer inputAngka:bilangan)
        {
            System.out.print(" " + inputAngka);
        }
        System.out.println("\n");
    }

    public void cariBilangan(Integer cari) {
        if (bilangan.contains(cari)) {
            System.out.println("\nData " + cari + " Berhasil ditemukan...!!!");
        } else {
            System.out.println("\nMaaf data yang anda cari tidak dapat ditemukan :( ");
        }
    }
}

public class TugasPertemuan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        alCari  ac = new alCari();
        int jumlahData;
        int bil;
        int find;

        System.out.println("==================================================");
        System.out.println("\tPROGRAM PENCARIAN MENGGUNAKAN ARRAY LIST");
        System.out.println("==================================================");
        System.out.print("Masukkan berapa banyak data yang ingin anda input = ");
        jumlahData = input.nextInt();
        System.out.println("==================================================");
        System.out.println("\t\t   Silahkan input data anda");
        System.out.println("==================================================");

        for(int i=0;i<jumlahData;i++){
            bil=input.nextInt();
            ac.setBilangan(bil);
        }

        ac.print();

        System.out.print("\nInput data yang ingin anda cari = ");
        find=input.nextInt();
        ac.cariBilangan(find);

    }
}
