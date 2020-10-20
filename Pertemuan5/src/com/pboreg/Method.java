package com.pboreg;

class MahasiswaUPJ1{
    //Data Mahasiswa
    String nama;
    String nim;

    //Constructor
    MahasiswaUPJ1(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    //Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.nim);
    }

    //Method tanpa return dan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //Method dengan return namun tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNim(){
        return this.nim;
    }

    //Method dengan return dan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Method {
    public static void main(String[] args) {
        MahasiswaUPJ1 mahasiswaUPJ2 = new MahasiswaUPJ1("Ucup","2019071024");
        // method
        mahasiswaUPJ2.show();
        mahasiswaUPJ2.setNama("Otong");

        mahasiswaUPJ2.show();
        System.out.println(mahasiswaUPJ2.getNama());
        System.out.println(mahasiswaUPJ2.getNim());

        String data = mahasiswaUPJ2.sayHi("keren");
        System.out.println(data);
    }

}
