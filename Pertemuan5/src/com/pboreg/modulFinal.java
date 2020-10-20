package com.pboreg;

public class modulFinal {
    final int a = 10;
    final double PI = 3.14;

    public static void main(String[] args){
        modulFinal myObj = new modulFinal();
        /*myObj.a = 50;
        myObj.PI = 25;
        will generate an error: cannot assign a value to a final variable
         */
        System.out.println(myObj.a);
    }
}

