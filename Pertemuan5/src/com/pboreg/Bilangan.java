    package com.pboreg;

    public class Bilangan {
        //Attribute
        private int a = 10; //atribut ini boleh diakses secara langsung dari luar classku
        private int b = 20; //atribut ini dapat diakses secara langsung dari luar classku dalam 1 package
        private int c = 30; // atribut ini tidak dapat diakses secara langsung dari luar classku

        //method
        public int tampilkanA() {
            return this.a;
        }

        public int tampilkanB() {
            return this.b;
        }

        public int tampilkanC() {
            return this.c;
        }
        public void inputA(int nilai){
            this.a = nilai;
        }
        public void inputB(int nilai){
            this.b = nilai;
        }
        public void inputC(int nilai){
            this.c = nilai;
        }
        public int tambah() {
            int hasil = this.a + this.b + this.c;
            return hasil;
        }

        public int kurang() {
            int hasil = this.a - this.b - this.c;
            return hasil;
        }

        public int kali() {
            int hasil = this.a * this.b * this.c;
            return hasil;
        }

        public double bagi() {
            double hasil = (double) this.a / (double) this.b;
            return hasil;
        }

        public void inputData(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }
