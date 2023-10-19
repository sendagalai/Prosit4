package tn.esprit.gestionzoo.entities;

package com.company;

import java.util.Arrays;

public class Animal {
    String family;
    String name;
    int age;
    Boolean isMammal;

    public Animal(String family,String name,int age,Boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean isMammal) {
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
            this.age = age;
        else
            System.out.println("Age doit etre positif");
    }

    public static class Zoo {
        private Animal[] animals;
        private static String name;
        private static String city;
        private static final int NBR_CAGES = 25;
        private int nbrAnimal = 0;

        public Zoo(String name, String city, int i) {
            this.name = name;
            this.city = city;


            this.animals = new Animal[NBR_CAGES];


        }

        public static String getName() {
            return name;
        }

        public static int getNBR_CAGES() {
            return NBR_CAGES;
        }

        public void setNbrAnimal(int nbrAnimal) {
            this.nbrAnimal = nbrAnimal;
        }

        public void setName(String name) {
            if (!name.isBlank())

                this.name = name;

            else
                System.out.println("le nom doit pas etre vide ");

        }


        private static String getcity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Animal[] getAnimals() {
            return animals;
        }

        public void setAnimals(Animal[] animals) {
            this.animals = animals;
        }

        public void DisplayZoo() {
            System.out.println("My tn.esprit.gestionzoo.entities.Animal.Zoo name is:" + Zoo.getName() + ",city is :" + Zoo.getcity() + "nmbr:" + Zoo.getNBR_CAGES());

        }


        @Override
        public String toString() {
            return "tn.esprit.gestionzoo.entities.Animal.Zoo{" +
                    "animals=" + Arrays.toString(animals) +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", nbrCages=" + NBR_CAGES +
                    '}';
        }


        public int searchAnimal(Animal animal) {
            for (int i = 0; i < nbrAnimal; i++) {
                if (animals[i].equals(animal)) {
                    return i;
                }

            }
            return -1;


        }

        public boolean removeAnimal(Animal animal) {
            for (int i = 0; i < nbrAnimal; i++) {
                if (animals[i].equals(animal)) {
                    for (int j = i; j < nbrAnimal - 1; j++) {
                        animals[j] = animals[j + 1];
                    }
                    animals[nbrAnimal - 1] = null;
                    nbrAnimal--;
                    return true;
                }
            }
            return false;
        }

        public Boolean addAnimal(Animal animal) {
            if (nbrAnimal > NBR_CAGES) {
                return false;
            }
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            return true;
        }

        public static Zoo comparerZoo(Zoo z1, Zoo z2) {
            if (z1.nbrAnimal > z2.nbrAnimal) {
                return z1;
            } else {
                return z2;
            }
        }


        public static boolean isZooFull(Zoo zoo) {
            return zoo.nbrAnimal >= zoo.NBR_CAGES;
        }




    }
}