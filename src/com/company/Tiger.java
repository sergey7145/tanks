package com.company;

public class Tiger extends Tank{
    int Power=135,Damage=650,Armor=100;
    public Tiger(int Power,int Damage,int Armor){
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
