package com.pboreg;

//Player
class Player{
    String name;
    double health;
    int level;

    //Object
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }
    void defence(double attackPower){ //Akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();
    }
}

//Senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}

//Armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Armor : " + this.name + " , Defence : " + this.defencePower);
    }
}

public class Latihan {
    public static void main(String[] args) {

        //Membuat object player
        Player player1 = new Player("Otong",100);
        Player player2 = new Player("Ucup",50);

        //Membuat object weapon
        Weapon Pedang = new Weapon("Pedang",15);
        Weapon Panah = new Weapon("Panah",1);

        //Membuat object armor
        Armor BajuBesi = new Armor("Baju Besi",10);
        Armor Tshirt = new Armor("T-shirt",0);

        //Ini untuk Player 1
        player1.equipWeapon(Pedang);
        player1.equipArmor(BajuBesi);
        player1.display();
        System.out.println("-----------------------------------");
        //Ini untuk Player 2
        player2.equipWeapon(Panah);
        player2.equipArmor(Tshirt);
        player2.display();

        System.out.println("\nIni Pertempuran");
        System.out.println("\n>>Eps. 1\n");
        player1.attack(player2);
        player1.display();
        System.out.println("-----------------------------------");
        player2.display();
        System.out.println("\n>>Eps. 2\n");
        player2.attack(player1);
        player1.display();
        System.out.println("-----------------------------------");
        player2.display();
    }
}