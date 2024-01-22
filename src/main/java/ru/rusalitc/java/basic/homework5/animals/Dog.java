package ru.rusalitc.java.basic.homework5.animals;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int endurance){
        super(name, speedRun, speedSwim, endurance);
        this.dischargeSwim = 2;
    }
}