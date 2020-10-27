package com.pboreg;

import java.util.*;

class Pegawai {
    String nama;
    String nip;
    String jabatan;
    int golongan;
    int jamKerja;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public static double persenPajak(double a, int b){
        return a / b;
    }

    void gaji() {
        int gajipokok = 0;
        int tunjangan = 0;
        int gajilembur;
        int totalgaji;
        int lembur;
        double gajiStlhPajak;

        if (golongan == 1) {
            gajipokok = 1486500;
            tunjangan = 300000;
        }
        if (golongan == 2) {
            gajipokok = 1926000;
            tunjangan = 300000;
        }
        if (golongan == 3) {
            gajipokok = 2456700;
            tunjangan = 350000;
        }
        if (golongan == 4) {
            gajipokok = 2899500;
            tunjangan = 400000;
        }
        if (jamKerja <= 172) {
            lembur = 0;
            System.out.println("Maaf anda tidak mendapat uang lembur");
            System.out.println("=====================================");
        }
        else {
            lembur = jamKerja - 173;
        }
        gajilembur = lembur * 20000;
        totalgaji = gajipokok + tunjangan + gajilembur;
        double Pajak = persenPajak(0.5, 100)*totalgaji;

        System.out.println("\tGaji Pokok Anda  = Rp.  " + gajipokok);
        System.out.println("\tTunjangan Anda   = Rp.  " + tunjangan);
        System.out.println("\tGaji Lembur Anda = Rp.  " + gajilembur);
        gajiStlhPajak = totalgaji - Pajak;
        System.out.println("=====================================");
        System.out.println("Total Gaji Anda adalah = RP.   " + gajiStlhPajak);
        System.out.println("=====================================");
    }
}

public class TugasPertemuan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai peg = new Pegawai();

        int jamKerja;
        int golongan;
        String nama;
        String nip;
        String jabatan;

        System.out.println("SILAHLAN MASUKKAN BIODATA ANDA");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIP : ");
        nip = input.nextLine();
        System.out.print("Jabatan : ");
        jabatan = input.nextLine();
        System.out.print("Jam kerja : ");
        jamKerja = input.nextInt();
        System.out.print("Golongan Pekerja : ");
        golongan = input.nextInt();
        System.out.println("========================");
        System.out.println("\t BIODATA ");
        System.out.println("========================");

        peg.setNama(nama);
        peg.setNip(nip);
        peg.setJabatan(jabatan);
        peg.setJamKerja(jamKerja);
        peg.setGolongan(golongan);

        System.out.println("Nama : " + peg.getNama());
        System.out.println("NIP : " + peg.getNip());
        System.out.println("Jabatan : " + peg.getJabatan());
        System.out.println("Jam Kerja : " + peg.getJamKerja());
        System.out.println("Golongan : " + peg.getGolongan());
        System.out.println("\n");
        System.out.println("=====================================");
        System.out.println("\t\t ||| GOLONGAN KE- " + golongan + "|||");
        System.out.println("=====================================");
        peg.gaji();
    }

}
