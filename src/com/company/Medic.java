package com.company;

public class Medic extends Hero{
    private String healPoints = " 10";
    public String increaseExperience(){
        return "Medic вылечил героев"+ healPoints + "%";
    }
    public String applySuperAbility(String SuperAbility) {
        return ("Medic применил суперспособность"+ SuperAbility);

    }
}
