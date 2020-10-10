package com.pboreg;

public class methodOverloading {
    static int kalkulasi(int x, int y){
        return x + y;
    }

    static double kalkulasi(double x, double y){
        return x - y;
    }
    static String kalkulasi (String x, String y){
        String hasil = x + " " + y; //variable lokal

        return hasil;
    }
    static String kalkulasi (String x, int y){
        String hasil = "nama " + x + ", umur " + y + " tahun";
        return  hasil;
    }

    public static void main(String[] args) {
        int nilai1 = kalkulasi(8, 5);
        double nilai2 = kalkulasi(4.3, 6.26);
        String nilai4 = kalkulasi("bagoes", 19);
        System.out.println("Nilai int = " + nilai1);
        System.out.println("Nilai Double = " + nilai2);
        System.out.println("Keterangan = " + nilai4);
    }
}
