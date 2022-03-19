package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[]heroes = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
          Magic(heroes[i]);
        }
    }
    public static void Magic(Hero hero){
        System.out.println(new Magic().applySuperAbility(" Super Endurance"));
        System.out.println(new Medic().applySuperAbility(" Atmokinesis"));
        System.out.println(new Warrior().applySuperAbility(" Super speed"));
        System.out.println(new Medic().increaseExperience());
    }
}
