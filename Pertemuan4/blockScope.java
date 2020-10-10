package com.pboreg;

public class blockScope {
    public static void main(String[] args) {

        //Code CANNOT use x here

        { // This is a block

            // code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } //the block ends here

        // Code here cannot use x
    }
}
