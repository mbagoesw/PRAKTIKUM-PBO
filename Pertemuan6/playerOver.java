package com.pboreg;

public class playerOver {
    private String name;
    private static int jumlahPlayer;

    // Overloading Constructor
    // opsi 1 :
    playerOver(String name){
        playerOver.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2 :
    playerOver(){
        playerOver.jumlahPlayer++;
        this.name = "player" + playerOver.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}
