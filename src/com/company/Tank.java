package com.company;

public class Tank {
    int Power,Damage,Armor;
    public Tank(int Power,int Damage,int Armor){
        this.Power=Power;
        this.Damage=Damage;
        this.Armor=Armor;
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
