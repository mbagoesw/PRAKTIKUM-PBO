package com.pboreg;

public class Person {
    String fname = "Jhon";
    String lname = "doe";
    int age = 24;


    public static void main(String[] args) {
        Person objek = new Person();
        System.out.println("Name: " + objek.fname + " " + objek.lname);
        System.out.println("Age: " + objek.age);
    }

}