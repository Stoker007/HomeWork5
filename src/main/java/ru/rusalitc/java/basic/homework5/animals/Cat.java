package ru.rusalitc.java.basic.homework5.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance); // если бы в условии не было сказано, что у каждого животного есть в т.ч. и параметр: скорость плвания, можно было бы его не наследовать
    }
    @Override
    public void swim (int distance) {
        System.out.println(name + " не умеет плавать");
    }
}