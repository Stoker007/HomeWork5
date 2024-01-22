package ru.rusalitc.java.basic.homework5.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim, int endurance){
        super(name, speedRun, speedSwim, endurance);
        this.dischargeSwim = 4;
    }
}