package com.pboreg;

public class modulAccesing {
    int x = 5;
    int y;

    public static void main(String[] args){
        modulAccesing myObj = new modulAccesing();
        System.out.println(myObj.x);

        //Modify Attributes
        modulAccesing myObj1 = new modulAccesing();
        myObj1.y = 40;
        System.out.println(myObj1.y);
    }
}
