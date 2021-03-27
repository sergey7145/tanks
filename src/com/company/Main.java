package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tiger = new Tiger(135, 650, 100);
        Tank leopard = new Leopard(1500, 218, 0);
        Tank[] tanks = new Tank[2];
        tanks[0] = leopard;
        tanks[1] = tiger;
        int maxPower = 0;
        int maxDamage = 0;
        int maxArmor = 0;
        for (int i = 0; i < tanks.length; i++) {
            if (tanks[i].getPower() > maxPower) {
                maxPower = tanks[i].getPower();
            }
            if (tanks[i].getDamage() > maxDamage) {
                maxDamage = tanks[i].getDamage();
            }
            if (tanks[i].getArmor() > maxArmor) {
                maxArmor = tanks[i].getArmor();
            }
        }
        System.out.println(maxPower);
        System.out.println(maxDamage);
        System.out.println(maxArmor);
    }
}



