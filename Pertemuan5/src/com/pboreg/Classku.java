package com.pboreg;

public class Classku {
    //Attribute
    private int a = 10; //atribut ini boleh diakses secara langsung dari luar classku
    private int b = 20; //atribut ini dapat diakses secara langsung dari luar classku dalam 1 package
    private int c = 30; //atribut ini tidak dapat diakses secara langsung dari luar classku

    //method
    public int tampilkanA() {
        return this.a;
    }

    public int tampilkanB() {
        return this.b;
    }

    public int tampilkanC() { return this.c; }



}
