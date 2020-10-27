package com.pboreg;

public class Kendaraan {
    private String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    public String getMerek(){
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
}
