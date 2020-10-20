package com.pboreg;

//abstract
abstract class Person1 {
    public String fname = "Johnny";
    public int age = 23;
    public abstract void study(); //abtract method
}

//Subclass
class Student extends Person1{
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}

class Abstract {
    public static void main(String[] args){
        Student myObj = new Student();

        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation Year : " + myObj.graduationYear);
        myObj.study();
    }
}