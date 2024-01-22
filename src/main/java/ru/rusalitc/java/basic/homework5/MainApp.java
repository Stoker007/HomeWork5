package ru.rusalitc.java.basic.homework5;

import ru.rusalitc.java.basic.homework5.animals.Cat;
import ru.rusalitc.java.basic.homework5.animals.Dog;
import ru.rusalitc.java.basic.homework5.animals.Horse;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Байкал", 10, 3, 1000);
        Cat cat = new Cat("Мурка", 8, 0, 500);
        Horse horse = new Horse("Ветерок", 20, 5, 2000);

        Scanner scaner = new Scanner(System.in);
        System.out.println("У нас есть три животных: собака, кошка и лошадь");
        System.out.println("Введите дистанцию (в метрах), чтобы понять за какое время все животные пробегут и проплывут данную дистанцию");
        int sc = scaner.nextInt();
        cat.run(sc);
        dog.run(sc);
        horse.run(sc);
        cat.swim(sc);
        dog.swim(sc);
        horse.swim(sc);
    }
}


