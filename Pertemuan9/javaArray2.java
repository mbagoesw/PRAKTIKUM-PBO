package com.pboreg;

import java.util.*;

class Contoh2 {
    private int[] angka2;

    public Contoh2(int jmlData) {
        angka2 = new int[jmlData];
    }

    public void viewAllFor() {
        System.out.println("------------");
        System.out.println("View All");
        for (int i = 0; i < this.angka2.length; i++) {
            System.out.println("Nilai " + (i + 1) + ": " + this.angka2[i]);
        }
    }

    public void setAngka2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Data ");
        for (int i = 0; i < this.angka2.length; i++) {
            System.out.print("Nilai " + (i + 1) + ": ");
            this.angka2[i] = input.nextInt();
        }
    }
}
    public class javaArray2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Bilangan : ");
            int jmlBil = input.nextInt();
            Contoh2 arrA = new Contoh2(jmlBil);
            arrA.setAngka2();
            arrA.viewAllFor();
        }
    }

