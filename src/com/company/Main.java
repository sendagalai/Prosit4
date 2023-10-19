package com.company;

public class Main {
    public static void main(String[] args) {

        Zoo zoo=new Zoo("friguia","souse",15);
        Animal lion = new Animal("simba","diego",10,true);
        Animal elephant = new Animal("Dumbo", "doe",50,false);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        System.out.println("Nom du zoo : " + zoo.getName());
        System.out.println("Capacité du zoo : " + zoo.getnbrAnimal());



    }
}
