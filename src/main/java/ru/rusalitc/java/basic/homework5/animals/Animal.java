package ru.rusalitc.java.basic.homework5.animals;

public class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int endurance;
    protected int dischargeRun;
    protected int dischargeSwim;

    public String getName() {
        return name;
    }

    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
        this.dischargeRun = 1;

    }

    public void run(int distance) {
        float time;
        int endurance2 = endurance;
        endurance2 = endurance - distance * dischargeRun;
        if (endurance2 < 0) {
            time = -1;
            System.out.println(name + " не сможет пробежать данную дистанцию, у животного кончатся силы");
            return;
        } else time = distance / speedRun;

        System.out.println(name + " пробежит данную дистанцию за " + time + " с");

    }
    public void swim(int distance) {
        float time;
        int endurance2 = endurance;
        endurance2 = endurance - distance * dischargeSwim;
        if (endurance2 < 0) {
            time = -1;
            System.out.println(name + " не сможет проплыть данную дистанцию, у животного кончатся силы");
            return;
        } else time = distance / speedSwim;

        System.out.println(name + " проплывет данную дистанцию за " + time + " с");

    }
}
