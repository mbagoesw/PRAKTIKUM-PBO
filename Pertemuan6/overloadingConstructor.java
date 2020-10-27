package com.pboreg;


public class overloadingConstructor{
    public static void main(String[] args) {
        playerOver player1 = new playerOver("otong");
        playerOver player2 = new playerOver();
        playerOver player3 = new playerOver();
        playerOver player4 = new playerOver("oyong");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading methods
        int a = Matematika.tambah(1,19);
        System.out.println(a);

        double b = Matematika.tambah(1, 0.98);
        System.out.println(b);

    }
}