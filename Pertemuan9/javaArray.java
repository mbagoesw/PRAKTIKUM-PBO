package com.pboreg;

class ContohArray{
    int jumlah;
    private int [] angka = {10,5,3,15,12,32};
    public void viewAllManual(){
        //sebut datanya satu2 berdasarkan indexnya
        System.out.println("Nilai 1 = " + this.angka[0]);
        System.out.println("Nilai 2 = " + this.angka[1]);
        System.out.println("Nilai 3 = " + this.angka[2]);
        System.out.println("Nilai 4 = " + this.angka[3]);
        System.out.println("Nilai 5 = " + this.angka[4]);
        System.out.println("Nilai 6 = " + this.angka[5]);
    }

    public void viewAllFor(){
        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + " = "+ this.angka[i]);
        }
    }

    public void viewAllWhile() {
        int i=0;
        while(i < this.angka.length){
            System.out.println("Nilai " + (i+1) + " = "+ this.angka[i]);
            i++;
        }
    }

    public void viewByID(int i){
        System.out.println("View by index");
        System.out.println("Nilai " + (i+1) + " = "+ this.angka[i]);

    }

    public void totalData(){
        for(int i=0; i < this.angka.length; i++){
            jumlah=jumlah+this.angka[i];
        }
        System.out.println(" Total dari array = " + jumlah);
    }

    public void  ratarata(){
        double rata;
        int total = 0;
        for (int i=0; i < this.angka.length; i++){
            total = total + this.angka[i];
        }
        rata = total / this.angka.length;
        System.out.println(" Rata-rata : " + String.format("%.2f",rata));
    }
}

public class javaArray {
    public static void main(String[] args) {
        ContohArray objArrA = new ContohArray();
        //objArrA.viewAllManual();
        //objArrA.viewAllFor();
        //objArrA.viewAllWhile();
        //objArrA.viewByID(2);
        objArrA.totalData();
        objArrA.ratarata();
    }
}
