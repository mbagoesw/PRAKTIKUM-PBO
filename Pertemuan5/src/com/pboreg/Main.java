package com.pboreg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = " + obil.tampilkanA());
        System.out.println("Nilai B = " + obil.tampilkanB());
        System.out.println("Nilai C = " + obil.tampilkanC());

        //nilaiA diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " +obil.tampilkanA());
        //nilaiB diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " +obil.tampilkanB());
        //nilaiC diinput
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " +obil.tampilkanC());

        //panggil method tambah()
        System.out.println("hasil pertambahan = " + obil.tambah());

        System.out.println("hasil perkurangan = " + obil.kurang());

        System.out.println("hasil perkalian = " + obil.kali());

        System.out.println("hasil pembagian = " + obil.bagi());

        //panggil method inputdata
        obil.inputData(3, 5, 2);
        System.out.println("inputdata =" + obil.tambah());
    }
}
