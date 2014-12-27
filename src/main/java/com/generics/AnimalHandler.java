package com.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalHandler {

    public static void main(String args[]){
        System.out.println("Making them talk!");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());

        AnimalHandler animalHandler = new AnimalHandler();

        animalHandler.makeThemTalk(animals);

    }

    public void makeThemTalk(List<? extends Animal> animalList){
        for(Animal animal : animalList){
            System.out.println(animal.doTalk());
        }
    }
}
