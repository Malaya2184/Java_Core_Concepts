package com.genericsWithInheritance;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Main {

    public static void printAnimal(@NotNull List<? super Dog> l) {
        for (Object obj : l) {
            if (obj instanceof Animal) {
                Animal animal = (Animal) obj;
                System.out.println(animal.name);
            }
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog("Dog1"), new Dog("Dog2"));
        printAnimal(animals);
    }
}
