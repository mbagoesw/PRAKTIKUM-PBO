package com.pboreg;



abstract class HitungLuas2 {
    protected double s1;
    protected double s2;

    public HitungLuas2(){
        this.s1 = 0;
        this.s2 = 0;
    }
    public HitungLuas2(double s1) {
        this.s1 = s1;
    }
    public HitungLuas2(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public abstract double getLuas();

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
}
class Segitiga3 extends HitungLuas2{
    public Segitiga3(double s1, double s2){
        super(s1,s2);
    }
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class Lingkaran3 extends HitungLuas2{
    public Lingkaran3(double s1){
        super(s1);
    }
    public double getLuas(){
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}
public class runLuas2 {
    public static void main(String[] args) {
        Segitiga3 oSegi = new Segitiga3(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegi.getS1() + " x " +
                oSegi.getS2() + " = " + oSegi.getLuas());

        Lingkaran3 oLingk = new Lingkaran3(10);
        System.out.println("Luas Lingkaran = " + oLingk.getLuas());
    }
}