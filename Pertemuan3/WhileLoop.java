package com.pboreg;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int i = 0;
        int jmlLoop;
        System.out.print("Masukkan Jumlah Loop: ");
    jmlLoop = myScan.nextInt();
    while (i < jmlLoop) {
        System.out.print(i +  " ");
        i++;
    }
    }
}
