package com.pboreg;

import java.util.*;

public class Login {
    public static void main(String[] args) {
        String  id;
        String password;
        int x=0;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("System Login");
        System.out.println("Selamat Datang!");

        do {
            x++;
            System.out.print("ini percobaan ke- " + x + "\n");

            System.out.print("username: ");
            id = inputUser.next();

            System.out.print("password: ");
            password = inputUser.next();

            if (id.equals("bagoes") && password.equals("bagoesw")){
                System.out.println("selamat datang");
                return ;
            }else{

                System.out.println("Password dan username yang anda masukkan salah silahkan mencoba lagi \n");
            }

        }while(x<3);
        System.out.println("percobaan login anda sudah habis");

    }
}
