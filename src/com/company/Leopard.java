package com.company;

public class Leopard extends Tank{
    int Power=1500, Damage=218, Armor=0;

    public Leopard(int Power, int Damage, int Armor) {
        super(Power,Armor,Damage);
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }
}

