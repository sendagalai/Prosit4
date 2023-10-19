package com.company;

import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    private static final int NBR_CAGES = 25;
    int nbrAnimal = 0;

    public Zoo(String name, String city, int i) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void DisplayZoo() {
        System.out.println("My Zoo name is:" + this.name + ",city is :" + this.city + "nmbr:25");
    }

    public String toString() {
        String var10000 = Arrays.toString(this.animals);
        return "Zoo{animals=" + var10000 + ", name='" + this.name + "', city='" + this.city + "', nbrCages=25}";
    }

    public Boolean addAnimal(Animal animal) {
        if (this.nbrAnimal > 25) {
            return false;
        } else {
            this.animals[this.nbrAnimal] = animal;
            ++this.nbrAnimal;
            return true;
        }
    }

    public int searchAnimal(Animal animal) {
        for(int i = 0; i < this.nbrAnimal; ++i) {
            if (this.animals[i].equals(animal)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for(int i = 0; i < this.nbrAnimal; ++i) {
            if (this.animals[i].equals(animal)) {
                for(int j = i; j < this.nbrAnimal - 1; ++j) {
                    this.animals[j] = this.animals[j + 1];
                }

                this.animals[this.nbrAnimal - 1] = null;
                --this.nbrAnimal;
                return true;
            }
        }

        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.nbrAnimal > z2.nbrAnimal ? z1 : z2;
    }

    public static boolean isZooFull(Zoo zoo) {
        return zoo.nbrAnimal >= 25;
    }


    public int getnbrAnimal() {
        return nbrAnimal;
    }
}


